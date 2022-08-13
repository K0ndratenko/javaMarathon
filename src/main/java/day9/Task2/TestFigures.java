package day9.Task2;

public class TestFigures {
    public static double calculateRedPerimeter(Figure[] figures){
//        Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур.
//        Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
       double sumOfPerimeters = 0;
        for(Figure figure: figures){
        if(figure.getColor().equals("Red")){
            sumOfPerimeters+=figure.perimeter();
        }

        }
        return sumOfPerimeters;
    }
    public static double calculateRedArea(Figure[] figures){
        double sumOfArea = 0;
        for(Figure figure: figures){
            if(figure.getColor().equals("Red")){
                sumOfArea+=figure.area();
            }

        }
        return sumOfArea;
    }
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

    }
}
