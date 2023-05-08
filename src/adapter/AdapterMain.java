package adapter;

public class AdapterMain {
    public static void main(String[] args) {


        Item item1 = new FoodItem("icecream",100,"Baskin Robbins");
        Item item2 = new FoodItem("Sweets",40,"Krishna Sweets");

        var swiggyStore = new SwiggyStore();
        swiggyStore.addItem(item1);
        swiggyStore.addItem(item2);

        System.out.println("After adding food items");
        swiggyStore.getItemList().forEach(item -> System.out.println("Item is:"+item));

        Item groceryItem = new GroceryToItemAdapter
                (new GroceryProductItem("Maida",200,"spencers"));

        swiggyStore.addItem(groceryItem);
        System.out.println("After adding grocery");
        swiggyStore.getItemList().forEach(item -> System.out.println("Item is:"+item));
    }
}
