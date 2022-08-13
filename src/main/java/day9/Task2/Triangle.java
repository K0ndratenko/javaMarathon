package day9.Task2;

public class Triangle extends Figure{
    private double lengthFirstSide;
    private double lengthSecondSide;
    private double lengthThirdSide;

    public Triangle( double lengthFirstSide, double lengthSecondSide, double lengthThirdSide,String color) {
        super(color);
        this.lengthFirstSide = lengthFirstSide;
        this.lengthSecondSide = lengthSecondSide;
        this.lengthThirdSide = lengthThirdSide;
    }

    @Override
    public double area() {
        double p = (lengthFirstSide + lengthSecondSide + lengthThirdSide) / 2;
        double resultFormula = p*(p-lengthFirstSide)*(p-lengthSecondSide)*(p-lengthThirdSide);
        return Math.sqrt(resultFormula);
    }

    @Override
    public double perimeter() {
        return lengthThirdSide+lengthFirstSide+lengthSecondSide;
    }
}
