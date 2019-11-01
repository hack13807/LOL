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

    //Handlerִ��ǰ����
    //Ӧ�ó�������¼��֤�������Ȩ
    //����ֵΪtrue���Ƿ��У�Ϊfalse�ǲ�����
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        double pangHu = accountService.queryMoney("PangHu");
        return true;
    }

    //����Handler��ʼִ�У������ڷ���ModelAndView֮ǰ����
    //Ӧ�ó�������ModelAndView������������԰ѹ���ģ�����ݴ���ǰ̨������ͳһָ����ͼ
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    //ִ����Handler֮�����
    //Ӧ�ó�����ͳһ�쳣����ͳһ��־����
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
