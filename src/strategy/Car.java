package strategy;

public class Car {

    private final DisplayStrategy displayStrategy;

    public Car(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void display() {
        displayStrategy.display();
    }
}
