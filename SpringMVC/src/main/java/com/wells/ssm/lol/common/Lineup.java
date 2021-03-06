package com.wells.ssm.lol.common;


import com.wells.ssm.lol.expetion.PieceCountExpetion;
import com.wells.ssm.lol.job.JobSpecies;
import com.wells.ssm.lol.piece.Piece;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Lineup {
    private List<Piece> pieceList = new ArrayList<Piece>();

    private Map<JobSpecies,Integer> lineupMap = new HashMap();

    public Lineup(){}

    public Lineup(List<Piece> pieceList) {
        if (pieceList.size() > 10) {
            throw new PieceCountExpetion("不能超过十个棋子！");
        }else if (pieceList.size() <= 0) {
            throw new PieceCountExpetion("请放入棋子！");
        }
        this.pieceList = pieceList;
    }

    public List<Piece> getPieceList() {
        return pieceList;
    }

    public void setPieceSet(List<Piece> pieceList) {
        if (pieceList.size() > 10) {
            throw new PieceCountExpetion("不能超过十个棋子！");
        }else if (pieceList.size() <= 0) {
            throw new PieceCountExpetion("请放入棋子！");
        }
        this.pieceList = pieceList;
    }

    public String getLineupResult(){
        List<JobSpecies> singleList = new ArrayList<>();
        Set<String> pieceSet = new HashSet();
        for (Piece piece:pieceList
             ) {
            Set<JobSpecies> jobs = piece.getJobs();
            if (!pieceSet.contains(piece.getName())) {
                singleList.addAll(piece.getJobs());
                pieceSet.add(piece.getName());
            }
        }
        for (JobSpecies job : singleList
        ) {
            if (lineupMap.get(job) == null) {
                    lineupMap.put(job, 1);
            } else {
                Integer integer = lineupMap.get(job);
                lineupMap.put(job, ++integer);
            }
        }

        return doCalculation(pieceList,lineupMap);
    }

    private String doCalculation(List<Piece> pieceList, Map<JobSpecies,Integer> lineupMap){
        StringBuilder sbBegin = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbEnd = new StringBuilder();
        sbBegin.append("\n\r");
        sbBegin.append("已选英雄棋子：");
        for (Piece piece:pieceList
             ) {
            sb.append(piece.getName()).append(",");
        }
        sb.replace(sb.length()-1,sb.length(),"");
        sb.append("\n\r");
        for (Map.Entry en : lineupMap.entrySet()
             ) {
            JobSpecies job = (JobSpecies) en.getKey();
            int triggerCount = job.getTriggerCount();
            int triggerCount2 = job.getTriggerCount2();
            int triggerMaxCount = job.getTriggerMaxCount();
            Integer valueCount = (Integer) en.getValue();
            String jobName = job.getName();
            String power = job.isPower(valueCount);

            if (power != null) {
                if (valueCount <= triggerCount2) {
                    triggerMaxCount = triggerCount2;
                }
                sb.append("(" + valueCount + "/" + triggerMaxCount + ")" + jobName + " : ");
                sb.append(power);
                sb.append("\n\r");
            } else {
                sbEnd.append("(" + valueCount + "/" + triggerCount + ")" + jobName);
                sbEnd.append("\n\r");
            }

        }
        return sbBegin.toString() + sb.toString() + sbEnd.toString();
    }

    public String getLineupResult(String[] names) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (String name:names
             ) {
            Piece pieceInstance = PieceFactory.getPieceInstance(name);
            pieceList.add(pieceInstance);
        }
        String lineupResult = getLineupResult();
        return lineupResult;
    }
}
