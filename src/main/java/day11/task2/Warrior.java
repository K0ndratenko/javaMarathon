package day11.task2;

public class Warrior  extends Hero implements PhysAttack{

    public Warrior() {
        super(100,0.8,0,30,0);

    }
    public String getHealthHero(){
       return  "Warrior health : " + super.getHealth();
    }
    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + super.getHealth() +
                ", physDef=" + super.getPhysDef() +
                ", magicDef=" + super.getMagicDef() +
                ", physAtt=" + super.getPhysAtt() +
                '}';
    }


    @Override
    public void physicalAttack(Hero hero) {
        double health = hero.getHealth()-(super.getPhysAtt() -(super.getPhysAtt() *hero.getPhysDef()));
        if(health <= Hero.MIN_HEALTH){
            hero.setHealth(MIN_HEALTH);
        }else{
            hero.setHealth(health);
        }
    }
}
