public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 5);
        Car car2 = new Car(8, 3);
        Motorcycle motorcycle = new Motorcycle(2, 200);
        Motorcycle motorcycle2 = new Motorcycle(4, 160);
        car.printInfo();
        motorcycle.printInfo();
        car2.printInfo();
        motorcycle2.printInfo();
    }
}