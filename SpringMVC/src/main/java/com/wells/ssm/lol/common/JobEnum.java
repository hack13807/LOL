package com.wells.ssm.lol.common;

public enum JobEnum {

    Yodel("Yodel","Լ�¶���",1),
    Gunners("Gunners","ǹ��",5),
    Noble("Noble","����",2),
    Magician("Magician","��ʦ",1),
    Pirate("Pirate","����",3),
    ShapeChanger("ShapeChanger","����ʦ",2),
    Swordsman("Swordsman","��ʿ",6),
    Fighter("Fighter","��ʿ",1),
    Wildness("Wildness","��Ұ",4),
    Ninja("Ninja","����",2),
    Empire("Empire","�۹�",1),
    Devil("Devil","��ħ",1),
    Rogue("Rogue","����",1),
    Poles("Poles","����",1);

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
