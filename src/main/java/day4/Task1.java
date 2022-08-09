package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его
         случайными числами от 0 до 10 (включительно). Используя цикл for each вывести содержимое
          массива в консоль, а также вывести в консоль информацию о:*/
public class Task1 {

    //        Длина массива: 10
//        Количество чисел больше 8: 1
//        Количество чисел равных 1: 0
//        Количество четных чисел: 6
//        Количество нечетных чисел: 4
//        Сумма всех элементов массива: 46
    public static void additionalInfo(int [] arr){
        int moreThanEight = 0;
        int one = 0;
        int odd = 0;
        int even = 0;
        int sum = 0;

        for(int item:arr){
            sum += item;
            if(item>8){
                moreThanEight++;
                if(oddOrEven(item)){
                    even++;
                }else{
                    odd++;
                }
            }else if(item==1){
                one++;
                odd++;
            }else{
                if(oddOrEven(item)){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
    public static boolean oddOrEven(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Random randomNumbers = new Random();
        int [] arr = new int[size];

        for(int i = 0; i < arr.length;i++){

            arr[i] = randomNumbers.nextInt(11);

        }

        for(int item : arr){
            System.out.print(item+ " ");

        }
        System.out.println();
        additionalInfo(arr);







//        for(int item : arr){
//            System.out.print(item+ " ");
//        }

    }
}
