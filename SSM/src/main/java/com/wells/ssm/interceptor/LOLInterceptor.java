package com.wells.ssm.interceptor;

import com.wells.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LOLInterceptor implements HandlerInterceptor {

    @Autowired
    private AccountService accountService;

    //Handler执行前调用
    //应用场景：登录认证、身份授权
    //返回值为true则是放行，为false是不放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        double pangHu = accountService.queryMoney("PangHu");
        return true;
    }

    //进入Handler开始执行，并且在返回ModelAndView之前调用
    //应用场景：对ModelAndView对象操作，可以把公共模型数据传到前台，可以统一指定视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    //执行完Handler之后调用
    //应用场景：统一异常处理、统一日志处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
