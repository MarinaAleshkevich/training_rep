public class Car extends Vehicle implements Costable {
    private int doorsCount;
    public Car ( int wheelCoun, int doorsCount){
        super(wheelCoun);
        this.doorsCount = doorsCount;
    }
    @Override
    protected void printInfo(){
    System.out.println("Транспортное средство: Машина - Количество колёс:" + wheelCoun + " - Количество дверей: " + doorsCount + " - Стоимость: " + getCost());
        }
    public int getCost(){
        return 2000;
    }
}
