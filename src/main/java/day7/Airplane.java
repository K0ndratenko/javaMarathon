package day7;

public class Airplane {
   String manufacturer ;
   int year;
   int length;
   int weight;
   int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel =0;
    }
    public static void compareAirplanes(Airplane firstPlane,Airplane secondPlane){
        if(firstPlane.length > secondPlane.length){
            System.out.println("Первый самолет длиннее");
        }else if (firstPlane.length < secondPlane.length){
            System.out.println("Второй самолет длиннее");

        }else{
            System.out.println("Длины самолетов равны");
        }
    }

   public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight +  ", количество топлива в баке: " + fuel);

    }

  public void fillUp(int n){
        fuel+=n;
   }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
