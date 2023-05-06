package decorator;

public class ToppingsMayo extends ToppingsDecorator {

    private final Burger burger;

    public ToppingsMayo(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " added Mayo,";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 30;
    }
}
