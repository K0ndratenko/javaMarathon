package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
 //
//4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
  //  Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
    //  выведите значение суммы и индекс первого элемента тройки.

    public static void main(String[] args) {
        int sumOfThreeValue =0;
        int mostValue = 0;
        int indexOfFirstNuber=0;
    Random randomInt = new Random();
     int[] arr = new int[100];
     for(int i=0;i<arr.length;i++){
         arr[i] = randomInt.nextInt(10001);

     }

     for(int i =0;i<arr.length-2;i++){
         sumOfThreeValue += arr[i] + arr[i+1] + arr[i+2];
         if(mostValue<sumOfThreeValue){
             mostValue = sumOfThreeValue;
             indexOfFirstNuber = i;
         }
         sumOfThreeValue = 0;
     }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма тре= чисел " + mostValue);
        System.out.println("Индекс первого числа " + indexOfFirstNuber);

    }
}
