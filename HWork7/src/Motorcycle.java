public class Motorcycle extends Vehicle implements Costable{
    private int maxSpeed;
    public Motorcycle (int wheelCount,int maxSpeed){
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }
    @Override
    protected void printInfo(){
    System.out.println("Транспортное средство:Мотоцикл - Количество колёс:" + wheelCoun + " - Максимальная скорость:" + maxSpeed + "км/ч" + " - Стоимость: " + getCost());
    }
    public int getCost(){
        return 8000;
    }
}
