package decorator;

public class TandoriBurger implements Burger {

    private String description;
    private double cost;

    public TandoriBurger(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "TandoriBurger{" +
                "description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
