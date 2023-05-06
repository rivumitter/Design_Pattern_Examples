package decorator;

public class ToppingCheese extends ToppingsDecorator {

    private final Burger burger;

    public ToppingCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " added Cheese,";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 60;
    }
}
