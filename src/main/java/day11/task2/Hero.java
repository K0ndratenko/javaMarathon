package day11.task2;

public abstract class Hero {
    public static int MAX_HEALTH =100;
    public static int MIN_HEALTH = 0;

    private double  health ;
    private double  physDef;
    private double  magicDef ;
    private int physAtt ;
    private int magicAtt ;
    public Hero(double health,double physDef,double magicDef,int physAtt,int magicAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;

    }

    public double getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }


    public void setHealth(double health) {
        this.health = health;
    }
}
