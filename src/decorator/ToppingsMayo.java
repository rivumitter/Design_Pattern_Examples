package decorator;

public class ToppingsMayo extends ToppingsDecorator {

    private final Burger burger;

    public ToppingsMayo(Burger burger) {
        this.burger = burger;
    }

    @Override
    String getDescription() {
        return burger.getDescription() + " added Mayo,";
    }

    @Override
    double getCost() {
        return burger.getCost() + 30;
    }
}
