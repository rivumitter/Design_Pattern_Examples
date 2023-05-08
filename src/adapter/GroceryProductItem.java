package adapter;

public class GroceryProductItem implements GroceryItem{
    private final String item;
    private final int price;
    private final String groceryOutletName;

    public GroceryProductItem(String item, int price, String groceryOutletName) {
        this.item = item;
        this.price = price;
        this.groceryOutletName = groceryOutletName;
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
    public String getGroceryOutletName() {
        return groceryOutletName;
    }

    @Override
    public String toString() {
        return "GroceryProductItem{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", groceryOutletName='" + groceryOutletName + '\'' +
                '}';
    }
}
