package decorator;

public class ZingerBurger extends Burger {

    private String description;
    private double cost;

    public ZingerBurger(String description, double cost) {
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
        return "ZingerBurger{" +
                "description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
