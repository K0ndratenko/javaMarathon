package day6;
public class Task1 {
    public static void main(String[] args) {
        Motorbike myBike = new Motorbike("R8","Black",2010);

        myBike.info();
        System.out.println(myBike.yearDifference(2011));

        Car myCar = new Car();
        myCar.setModel("X5");
        myCar.setColor("White");
        myCar.setYear(1993);

        myCar.info();
        System.out.println(myCar.yearDifference(1990));

    }
}
