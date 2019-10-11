package com.wells.lol.controller;

import com.wells.lol.common.Lineup;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ItemController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String[] values = request.getParameterValues("piece") ;
        String piece = request.getParameter("piece");
        String lineupResult = "";
        try {
            lineupResult = new Lineup().getLineupResult(values);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (lineupResult == null || lineupResult.trim().equals("")) {
            lineupResult = "��ѡ������һö����";
        }

        request.setAttribute("resultStr",lineupResult);
        response.getWriter().write(lineupResult);
        response.getWriter().close();
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
