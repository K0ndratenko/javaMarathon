package day5;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfProduction;

    public Motorbike(String model, String color, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
