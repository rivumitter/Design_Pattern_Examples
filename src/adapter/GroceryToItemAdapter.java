package adapter;

public class GroceryToItemAdapter implements Item{

    private final GroceryProductItem groceryProductItem;

    public GroceryToItemAdapter(GroceryProductItem groceryProductItem) {
        this.groceryProductItem = groceryProductItem;
    }

    @Override
    public String getItemName() {
        return groceryProductItem.getItemName();
    }

    @Override
    public Integer getItemPrice() {
        return groceryProductItem.getItemPrice();
    }

    @Override
    public String getItemOutletName() {
        return groceryProductItem.getGroceryOutletName();
    }

    @Override
    public String toString() {
        return "GroceryToItemAdapter{" +
                "groceryProductItem=" + groceryProductItem +
                '}';
    }
}
