package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed = false;
    private Warehouse placeOfWork;
    public Courier(Warehouse placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary='" + salary + '\'' +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }
    public void doWork(){
        salary += 100;
        placeOfWork.addDeliveredOrders();
    }


    public void bonus (){
        if(placeOfWork.getCountDeliveredOrders() < 10_000){
            System.out.println("Бонус пока не доступен");
        }else if(placeOfWork.getCountDeliveredOrders() == 10_000 && !isPayed) {
            salary +=50_000;
            isPayed = true;
        }else{
            System.out.println("Бонус уже был выплачен");
        }


    }
}
