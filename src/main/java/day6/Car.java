package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfProduction;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYear(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return inputYear > yearOfProduction ? inputYear - yearOfProduction : yearOfProduction - inputYear;
    }
}
