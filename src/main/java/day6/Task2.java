package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane somePlane = new Airplane("AirCompany",2002,80,5350);

        somePlane.setYear(2008);
        somePlane.setLength(120);
        somePlane.fillUp(15);
        somePlane.fillUp(20);

        somePlane.info();

    }
}
