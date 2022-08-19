package day11.task2;
//Воин атакует Паладина
//Паладин атакует Мага
//Шаман лечит Мага
//Маг атакует Паладина, тип атаки М
//Шаман атакует Воина, тип атаки Ф
//Паладин лечит себя
//Воин атакует Мага 5 раз
public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.physicalAttack(paladin);
        System.out.println(paladin.getHealthHero());
        paladin.physicalAttack(magician);
        System.out.println(magician.getHealthHero());
        shaman.healTeammate(magician);
        System.out.println(magician.getHealthHero());
        magician.magicalAttack(paladin);
        System.out.println(paladin.getHealthHero());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.getHealthHero());
        paladin.healHimself();
        System.out.println(paladin.getHealthHero());
        warrior.physicalAttack(magician);
        System.out.println(magician.getHealthHero());

        warrior.physicalAttack(magician);
        System.out.println(magician.getHealthHero());

        warrior.physicalAttack(magician);
        System.out.println(magician.getHealthHero());

        warrior.physicalAttack(magician);
        System.out.println(magician.getHealthHero());

        warrior.physicalAttack(magician);
        System.out.println(magician.getHealthHero());

    }
}
