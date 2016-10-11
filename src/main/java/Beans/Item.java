package Beans;

/**
 * Created by 2 on 2016/10/11.
 */
public class Item {
    String ItemName;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemName='" + ItemName + '\'' +
                '}';
    }
}
