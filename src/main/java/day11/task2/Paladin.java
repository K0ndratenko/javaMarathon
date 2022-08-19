package day11.task2;

public class Paladin extends Hero implements Healer,PhysAttack {
    private final int HEAL_HIMSELF;
    private final int HEAL_TEAMMATE;
    public Paladin() {
        super(100,0.5,0.2,15,25);
        HEAL_HIMSELF = 25;
        HEAL_TEAMMATE = 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + super.getHealth() +
                ", physDef=" + super.getPhysDef() +
                ", magicDef=" + super.getMagicDef() +
                ", physAtt=" + super.getPhysAtt() +
                ", magicAtt=" + super.getMagicAtt() +
                '}';
    }


    public String getHealthHero(){
        return  "Paladin health : " + super.getHealth();
    }
    @Override
    public void healHimself() {
        if(super.getHealth()>Hero.MIN_HEALTH){
            if(super.getHealth()+HEAL_HIMSELF >= Hero.MAX_HEALTH){
                super.setHealth(Hero.MAX_HEALTH);
            }else{
                super.setHealth(super.getHealth()+HEAL_HIMSELF);
            }
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth() > MIN_HEALTH){
            if(hero.getHealth() + HEAL_TEAMMATE >=MAX_HEALTH){
                hero.setHealth(MAX_HEALTH);
            }else{
                hero.setHealth(hero.getHealth()+HEAL_TEAMMATE);
            }
        }

    }

    @Override
    public void physicalAttack(Hero hero) {
        double health = hero.getHealth()-(super.getPhysAtt() -(super.getPhysAtt() *hero.getPhysDef()));
        if(health <= Hero.MIN_HEALTH){
            hero.setHealth(0);
        }else{
            hero.setHealth(health);
        }
    }

}
