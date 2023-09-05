package strategy;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar();
        sportsCar.display();

        Car offRoadCar = new OffRoadCar();
        offRoadCar.display();
    }
}
