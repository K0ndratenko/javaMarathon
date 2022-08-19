package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker){
        for (int i =0;i<10_000;i++){
            worker.doWork();
        }
        worker.bonus();
    }
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        businessProcess(picker);
        businessProcess(courier);

        System.out.println(warehouse);
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());



        Warehouse secondWarehouse = new Warehouse();

        Courier secondCourier = new Courier(secondWarehouse);
        Picker secondPicker = new Picker(secondWarehouse);
        secondPicker.doWork();
        secondCourier.doWork();

        System.out.println();
        System.out.println();

        System.out.println(warehouse);
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
    }
}
