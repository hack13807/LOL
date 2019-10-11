package com.wells.lol.common;

public enum JobEnum {

    Yodel("com.wells.lol.job.Yodel","Լ�¶���",1),
    Gunners("com.wells.lol.job.Gunners","ǹ��",5),
    Noble("com.wells.lol.job.Noble","����",2),
    Magician("com.wells.lol.job.Magician","��ʦ",1),
    Pirate("com.wells.lol.job.Pirate","����",3),
    ShapeChanger("com.wells.lol.job.ShapeChanger","����ʦ",2),
    Swordsman("com.wells.lol.job.Swordsman","��ʿ",6),
    Fighter("com.wells.lol.job.Fighter","��ʿ",1),
    Wildness("com.wells.lol.job.Wildness","��Ұ",4),
    Ninja("com.wells.lol.job.Ninja","����",2),
    Empire("com.wells.lol.job.Empire","�۹�",1),
    Devil("com.wells.lol.job.Devil","��ħ",1),
    Rogue("com.wells.lol.job.Rogue","����",1),
    Poles("com.wells.lol.job.Poles","����",1);

    private final String name;

    private final String number;

    private final int piecesCount;



    private JobEnum(String number,String name,int piecesCount)
    {
        this.number = number;
        this.name = name;
        this.piecesCount = piecesCount;
    }

    public String getName() {
        return name;
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public String getNumber() {
        return number;
    }
    public static String getJobEnumByName(String name){
        for(JobEnum jobEnum : JobEnum.values()){
            if(name.equals(jobEnum.getName())){
                return jobEnum.getNumber();
            }
        }
        return null;
    }

    public static int getPiecesCountEnumByName(String number){
        for(JobEnum jobEnum : JobEnum.values()){
            if(number.equals(jobEnum.getNumber())){
                return jobEnum.getPiecesCount();
            }
        }
        return 0;
    }
}
