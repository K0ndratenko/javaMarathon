package day7;

public class Player {
   private int stamina;
   private static final  int MAX_AMOUNT_PLAYERS =6;
   public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers<MAX_AMOUNT_PLAYERS){
            countPlayers++;
        }
    }

    public void run(){
        if(stamina > 0) {
            stamina -= 1;
        }
        if(stamina == 0 || stamina < 0){
            countPlayers--;
        }
    }

    public static void info(){
        String result = countPlayers < MAX_AMOUNT_PLAYERS ? "Команды неполные. На поле еще есть " + (MAX_AMOUNT_PLAYERS - countPlayers)
                + " свободных мест" : "На поле нет свободных мест";
        System.out.println(result);
    }
}
