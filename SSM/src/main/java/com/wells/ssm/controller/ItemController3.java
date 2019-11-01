package com.wells.ssm.controller;

import com.wells.ssm.exception.LOLException;
import com.wells.ssm.lol.common.Lineup;
import com.wells.ssm.pojo.Jobspecies;
import com.wells.ssm.pojo.Piece;
import com.wells.ssm.service.AccountService;
import com.wells.ssm.service.PieceService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


//@RestController  相当于Controller和ResponseBody注解的结合体
@RestController
@RequestMapping(value = "line",produces = "application/json;charset=utf-8")
public class ItemController3 {

    @Autowired
    private AccountService accountService;
    @Autowired
    private PieceService pieceService;

    @GetMapping("{piece}")
    @ResponseBody
    public String getLineup(@PathVariable String[] piece) throws LOLException {//@RequestParam(value = "piece")
        try {
//            accountService.transMoney("Mr.ma", "panghu", 10);
            List<Piece> pieces = pieceService.queryPieceList();
            double panghu = accountService.queryMoney("panghu");
            double Mrma = accountService.queryMoney("Mr.ma");
            System.out.println(panghu);
            System.out.println(Mrma);
        } catch (Exception e) {
            System.out.println(e);
        }
        String lineupResult = "";
        try {
            lineupResult = new Lineup().getLineupResult(piece);
            if (lineupResult == null || lineupResult.trim().equals("")) {
                lineupResult = "请选择至少一枚棋子";
            }
        } catch (Exception e) {
            throw new LOLException("asd");
        }
        return lineupResult;
    }

    @RequestMapping(value = "testForward")
    public String testForward(@RequestParam(value = "id",required = false,defaultValue = "9527") int id) {
//        return "/index.jsp";
//        return "参数:"+id;
        JSONObject object=new JSONObject();
        object.put("msg","哈哈");
        return "/index.jsp";
    }

    @RequestMapping(value = "testpojo")
    @ResponseBody
    public Piece testpojo(PieceVo vo) {
        return vo.getPiece();
    }
    @RequestMapping("{id}/{name}")
    @ResponseBody
    public Piece testRestful(@PathVariable int id, @PathVariable String name,Piece piece) {
        return piece;
    }
    @RequestMapping(value = "array",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String[] array(String[] id) {
        return id;
    }
    @RequestMapping(value = "collation",produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<Jobspecies> collation(PieceVo vo) {
        return vo.getJobspeciesList();
    }
    @RequestMapping(value = "date",produces = "application/json;charset=utf-8")
    public Date date(Date date) throws LOLException {
        return date;
    }
}
