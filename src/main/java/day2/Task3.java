package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {



        Scanner scanNumber = new Scanner(System.in);
        int a = scanNumber.nextInt();
        int b = scanNumber.nextInt();
        int countVar = ++a;
        while (countVar<b){
            if(countVar%5 == 0 && countVar%10 != 0){
                System.out.print(countVar + " ");
                countVar++;
            }
            countVar++;
        }

        if(a >= b){
            System.out.println("Некорректный ввод");
        }


    }
}
