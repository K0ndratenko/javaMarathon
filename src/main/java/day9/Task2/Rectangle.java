package day9.Task2;

public class Rectangle extends Figure{
    private int weight;
    private int height;

    public Rectangle( int weight, int height,String color) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double area() {
        return weight*height;
    }

    @Override
    public double perimeter() {
        return (weight*2) + (height*2);
    }
}
