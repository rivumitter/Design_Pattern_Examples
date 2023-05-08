package adapter;

import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {

    List<Item> itemList;

    public SwiggyStore() {
        itemList = new ArrayList<>();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }
}
