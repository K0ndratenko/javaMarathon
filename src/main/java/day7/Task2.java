package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {
         final  int MAX_PLAYERS = 6;
        Random randomValue = new Random();
        List<Player> listOfPlayers = new ArrayList<>();

        for(int i = 0;i<MAX_PLAYERS;i++){
           int randomStaminaForPlayer= randomValue.nextInt(101 -90) +90;
            listOfPlayers.add(new Player(randomStaminaForPlayer));

        }
        Player.info();
        while(listOfPlayers.get(0).getStamina()>0){
            listOfPlayers.get(0).run();

            System.out.println(listOfPlayers.get(0).getStamina());
        }


        Player.info();
        System.out.println(  Player.getCountPlayers());

    }
}
