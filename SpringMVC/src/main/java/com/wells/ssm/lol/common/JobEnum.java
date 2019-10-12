package com.wells.ssm.lol.common;

public enum JobEnum {

    Yodel("Yodel","约德尔人",1),
    Gunners("Gunners","枪手",5),
    Noble("Noble","贵族",2),
    Magician("Magician","法师",1),
    Pirate("Pirate","海盗",3),
    ShapeChanger("ShapeChanger","换形师",2),
    Swordsman("Swordsman","剑士",6),
    Fighter("Fighter","斗士",1),
    Wildness("Wildness","狂野",4),
    Ninja("Ninja","忍者",2),
    Empire("Empire","帝国",1),
    Devil("Devil","恶魔",1),
    Rogue("Rogue","浪人",1),
    Poles("Poles","极地",1);

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
