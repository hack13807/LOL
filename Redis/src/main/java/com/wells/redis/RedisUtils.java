package com.wells.redis;

import org.apache.log4j.Logger;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtils {

    private static int port = 6379;
    private static String host = "172.20.14.83";
    private static JedisPool pool;
    private static Jedis jedis;

    static {
        pool = new JedisPool(host,port);
    }

    private void Jedis(){
    }

    public static Jedis getJedis(){
        if (jedis == null) {
            synchronized (RedisUtils.class){
                if (jedis == null) {
                    return pool.getResource();
                }
            }
        }
        return jedis;
    }


    public static boolean getLock(String lockKey, String requestId, int timeout) {
        //获取jedis对象，负责和远程redis服务器进行连接
        Jedis jedis = getJedis();
        String result = jedis.set(lockKey, requestId, "nx", "ex", timeout);
        if ("OK".equals(requestId)) {
            return true;
        }
        return false;
    }

    public static synchronized boolean getLock2(String lockKey, String requestId, int timeout) {
        //获取jedis对象，负责和远程redis服务器进行连接
        Jedis jedis = getJedis();
        Long result = jedis.setnx(lockKey, requestId);
        if ("1".equals(result)) {
            // 若在这里程序突然崩溃，则无法设置过期时间，将发生死锁
            jedis.expire(lockKey,timeout);
            return true;
        }
        return false;
    }

    public static void releaseLock(String lockKey, String requestId){
        Jedis jedis = getJedis();
        String value = jedis.get(lockKey);
        if (value.equals(requestId)) {
            jedis.del(lockKey);
        }
    }

    public static void main(String[] args) {
        Jedis jedis = RedisUtils.getJedis();
        String k1 = jedis.get("k1");
        System.out.println(k1);
        Jedis jedis1 = new Jedis("127.0.0.1", 6379);
        String k11 = jedis1.get("k1");
        System.out.println(k11);

    }

}
