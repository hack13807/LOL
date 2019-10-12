package com.wells.ssm.lol.controller;

import com.wells.ssm.lol.common.Lineup;
import com.wells.ssm.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class ItemController3 {

    @Resource
    private AccountService accountService;

    @RequestMapping("/getLineup")
    public void getLineup(HttpServletRequest request, HttpServletResponse response) {
        try {
            accountService.transMoney("Mr.ma","panghu",10);
        }catch (Exception e){
            System.out.println(e);
        }
        double panghu = accountService.queryMoney("panghu");
        double Mrma = accountService.queryMoney("Mr.ma");
        System.out.println(panghu);
        System.out.println(Mrma);

        try {
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
                lineupResult = "请选择至少一枚棋子";
            }

            request.setAttribute("resultStr",lineupResult);
            response.getWriter().write(lineupResult);
            response.getWriter().close();
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
