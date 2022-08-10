package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Blue");
        myCar.setModel("X5");
        myCar.setYearOfProduction(2018);

        System.out.println("Color " + myCar.getColor());
        System.out.println("Model " + myCar.getModel());
        System.out.println("Year " + myCar.getYearOfProduction());
    }
}
