package day8;

public class Task1 {
    public static void main(String[] args) {
        final int howManyTimes = 20000;
        long timeStart = System.currentTimeMillis();
        String someString = "";
        for(int i = 0;i<=howManyTimes;i++){
            someString += i + " ";

        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time String " + (timeEnd - timeStart));
        System.out.println(someString);


        long timeStartStrBl = System.currentTimeMillis();

        StringBuilder anotherString = new StringBuilder("");
        for(int i = 0;i<=howManyTimes;i++){
            anotherString.append(i).append(" ");

        }
        long timeEndStrBl = System.currentTimeMillis();
        System.out.println(anotherString);
        System.out.println("Time SrtBuilder " + (timeEndStrBl - timeStartStrBl) + "ms");


    }
}
