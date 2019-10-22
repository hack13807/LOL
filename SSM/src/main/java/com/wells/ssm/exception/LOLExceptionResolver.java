package com.wells.ssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LOLExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String msg;
        if (e instanceof LOLException) {
            msg = ((LOLException) e).getMsg();
        }else {
            msg = "未知";
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/error.jsp");
        mv.addObject("msg",msg);
        mv.addObject("resultStr",msg);
        return mv;
    }
}
