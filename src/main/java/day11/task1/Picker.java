package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed = false;
    private Warehouse placeOfWork;
    public Picker(Warehouse placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public void doWork(){
        salary += 80;
        placeOfWork.addPickedOrders();

    }


    public void bonus (){
        if(placeOfWork.getCountPickedOrders() < 10_000){
            System.out.println("Бонус пока не доступен");
        }else if(placeOfWork.getCountPickedOrders() == 10_000 && !isPayed) {
            salary +=70_000;
            isPayed = true;
        }else{
            System.out.println("Бонус уже был выплачен");
        }


    }
}
