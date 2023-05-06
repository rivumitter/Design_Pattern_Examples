package decorator;

public class ToppingCheese extends ToppingsDecorator {

    private final Burger burger;

    public ToppingCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    String getDescription() {
        return burger.getDescription() + " added Cheese,";
    }

    @Override
    double getCost() {
        return burger.getCost() + 60;
    }
}
