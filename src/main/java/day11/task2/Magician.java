package day11.task2;

public class Magician extends Hero implements MagicAttack,PhysAttack {


    public Magician() {
        super(100,0,0.8,5,20);

    }
    @Override
    public String toString() {
        return "Magician{" +
                "health=" + super.getHealth() +
                ", physDef=" + super.getPhysDef() +
                ", magicDef=" + super.getMagicDef() +
                ", physAtt=" + super.getPhysAtt() +
                ", magicAtt=" + super.getMagicAtt() +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double health = hero.getHealth()-(super.getMagicAtt()-(super.getMagicAtt()*hero.getMagicDef()));
        if(health <= Hero.MIN_HEALTH){
            hero.setHealth(MIN_HEALTH);
        }else{
            hero.setHealth(health);
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
    public String getHealthHero(){
        return  "Magician health : " + super.getHealth();
    }
}
