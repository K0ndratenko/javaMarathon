package day4;

import java.util.Arrays;
import java.util.Random;

/*
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12,
n=8 (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки,
сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
*/
public class Task3 {
    public static void main(String[] args) {
        Random randomNumb = new Random();
        int [][] arrDouble = new int[12][8];
        for(int i =0;i<arrDouble.length;i++){

            for(int j=0;j<arrDouble[i].length;j++){
                arrDouble[i][j] = randomNumb.nextInt(51);
            }
        }

        int firstResult =0;
        int secondResult =0;
        int whichIterate = 0;
        for(int i =0;i<arrDouble.length;i++){
                if(firstResult>=secondResult){
                    secondResult = firstResult;
                    firstResult =0;
                    whichIterate = i-1;
                }else{
                    firstResult =0;
                }
            for(int j=0;j<arrDouble[i].length;j++){
                arrDouble[i][j] = randomNumb.nextInt(51);
                firstResult += arrDouble[i][j];
            }
            System.out.print(firstResult + " ");
        }




        System.out.println(Arrays.deepToString(arrDouble));

        System.out.println(whichIterate);
    }
}
