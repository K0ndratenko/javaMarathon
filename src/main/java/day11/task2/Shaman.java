package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer{

    private final int HEAL_HIMSELF;
    private final int HEAL_TEAMMATE;


    public Shaman() {
        super(100,0.2,0.2,10,15);
        HEAL_HIMSELF = 50;
        HEAL_TEAMMATE = 30;

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + super.getHealth() +
                ", physDef=" + super.getPhysDef() +
                ", magicDef=" + super.getMagicDef() +
                ", physAtt=" + super.getPhysAtt() +
                ", magicAtt=" + super.getMagicAtt() +
                '}';
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

    public String getHealthHero(){
        return  "Shaman health : " + super.getHealth();
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
            hero.setHealth(MIN_HEALTH);
        }else{
            hero.setHealth(health);
        }


    }
}
