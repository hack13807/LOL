package com.wells.ssm.service;

import com.wells.ssm.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper mapper;
    @Override
    public void transMoney(String fromName, String toName, double money) {
        double fromMoney = mapper.queryMoney(fromName);
        double toMoney = mapper.queryMoney(toName);
        if (fromMoney-money < -0.000001) {
            throw new RuntimeException("Óà¶î²»×ã");
        }
        mapper.update(fromName,fromMoney - money);
//        System.out.println(1/0);
        mapper.update(toName,toMoney + money);
    }

    @Override
    public double queryMoney(String name) {
        double fromMoney = mapper.queryMoney(name);
        return fromMoney;
    }
}
