package decorator;

public class ZingerBurger implements Burger {

    private String description;
    private double cost;

    public ZingerBurger(String description, double cost) {
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
        return "ZingerBurger{" +
                "description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
