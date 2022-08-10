package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike myBike = new Motorbike("R6","Black",2017);

        System.out.println(myBike.getColor());
        System.out.println(myBike.getModel());
        System.out.println(myBike.getYearOfProduction());
    }
}
