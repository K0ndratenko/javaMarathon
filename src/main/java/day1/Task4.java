package day1;

public class Task4 {
    public static void main(String[] args) {


        //начиная от 1980 до 2020, с шагом увеличения равным 4.
        int year = 1980;
        while(year <= 2020){
            System.out.println("Олимпиада" + year + "года");
            year +=4;
        }
    }
}
