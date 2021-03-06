package com.wells.ssm.lol.common;

import com.wells.ssm.lol.job.JobSpecies;
import com.wells.ssm.lol.piece.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PieceFactory {
    
    public static Piece getPieceInstance(String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String[] withJob = name.split("&");
        JobSpecies jobSpecies = null;
        if (withJob.length > 1) {
            name = withJob[0];
            String job = withJob[1];
            String className = JobEnum.getJobEnumByName(job);
            Class<?> jobClass = Class.forName(className);
            Method method = jobClass.getMethod("getInstance");
            jobSpecies = (JobSpecies) method.invoke(JobSpecies.class);
        }

        Piece obj = null;
        switch (name.trim()) {
            case "С��":
                obj = new Tristana();
                break;
            case "�°���":
                obj = new Lucian();
                break;
            case "����":
                obj = new Ali();
                break;
            case "�ɶ�":
                obj = new Nar();
                break;
            case "����":
                obj = new Warwick();
                break;
            case "����":
                obj = new Plonk();
                break;
            case "��Ů":
                obj = new Nidalee();
                break;
            case "��ǹ":
                obj = new Graves();
                break;
            case "����":
                obj = new Fiona();
                break;
            case "��":
                obj = new Shen();
                break;
            case "��ħ":
                obj = new Atox();
                break;
            case "������":
                obj = new Draven();
                break;
            case "Ůǹ":
                obj = new Sarah();
                break;
            case "����":
                obj = new Asia();
                break;
            case "¶¶":
                obj = new Lulu();
                break;
            case "����":
                obj = new Kennan();
                break;
            case "����":
                obj = new Volibear();
                break;
        }
        if (jobSpecies != null) {
            obj.addJob(jobSpecies);
        }
        return obj;
    }
}
