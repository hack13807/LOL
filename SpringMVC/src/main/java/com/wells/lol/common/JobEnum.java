package com.wells.lol.common;

public enum JobEnum {

    Yodel("com.wells.lol.job.Yodel","约德尔人",1),
    Gunners("com.wells.lol.job.Gunners","枪手",5),
    Noble("com.wells.lol.job.Noble","贵族",2),
    Magician("com.wells.lol.job.Magician","法师",1),
    Pirate("com.wells.lol.job.Pirate","海盗",3),
    ShapeChanger("com.wells.lol.job.ShapeChanger","换形师",2),
    Swordsman("com.wells.lol.job.Swordsman","剑士",6),
    Fighter("com.wells.lol.job.Fighter","斗士",1),
    Wildness("com.wells.lol.job.Wildness","狂野",4),
    Ninja("com.wells.lol.job.Ninja","忍者",2),
    Empire("com.wells.lol.job.Empire","帝国",1),
    Devil("com.wells.lol.job.Devil","恶魔",1),
    Rogue("com.wells.lol.job.Rogue","浪人",1),
    Poles("com.wells.lol.job.Poles","极地",1);

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
