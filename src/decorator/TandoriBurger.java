package decorator;

public class TandoriBurger extends Burger {

    private String description;
    private double cost;

    public TandoriBurger(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double getCost() {
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
