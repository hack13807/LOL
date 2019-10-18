//package com.wells.ssm.controller;
//
//import com.wells.ssm.lol.common.Lineup;
//import org.apache.log4j.Logger;
//import org.springframework.web.HttpRequestHandler;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class ItemController2 implements HttpRequestHandler {
//    Logger log = Logger.getLogger(ItemController2.class);
//
//    @Override
//    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String[] values = request.getParameterValues("piece") ;
//        String piece = request.getParameter("piece");
//        String lineupResult = "";
//        try {
//            lineupResult = new Lineup().getLineupResult(values);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (lineupResult == null || lineupResult.trim().equals("")) {
//            lineupResult = "请选择至少一枚棋子";
//        }
//
//        log.debug(lineupResult);
//        request.setAttribute("resultStr",lineupResult);
//        response.getWriter().write(lineupResult);
//        response.getWriter().close();
//        request.getRequestDispatcher("/index.jsp").forward(request, response);
//    }
//}
