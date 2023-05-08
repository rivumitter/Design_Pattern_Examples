package adapter;

public class FoodItem implements Item {

    private final String item;
    private final int price;
    private final String outletName;

    public FoodItem(String item, int price, String outletName) {
        this.item = item;
        this.price = price;
        this.outletName = outletName;
    }

    @Override
    public String getItemName() {
        return item;
    }

    @Override
    public Integer getItemPrice() {
        return price;
    }

    @Override
    public String getItemOutletName() {
        return outletName;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", outletName='" + outletName + '\'' +
                '}';
    }
}
