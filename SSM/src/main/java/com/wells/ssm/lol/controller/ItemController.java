package com.wells.ssm.lol.controller;

import com.wells.ssm.lol.common.Lineup;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ItemController {

//    @RequestMapping("/getLineup")
    public ModelAndView getLineup(@RequestParam(value = "piece") String[] piece) {
        ModelAndView mv = new ModelAndView();
        String lineupResult = "";
        try {
            lineupResult = new Lineup().getLineupResult(piece);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (lineupResult == null || lineupResult.trim().equals("")) {
            lineupResult = "请选择至少一枚棋子";
        }
        mv.addObject("resultStr",lineupResult);
        List<Object> list = new ArrayList<>();
        list.add(lineupResult);
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(list);
        String result = "{\"result\":\""+lineupResult+"\"}";
        mv.addObject("resultStr",lineupResult);
        mv.setViewName("/index.jsp");
        return mv;
    }
}
