package Beans;

import java.util.List;

/**
 * Created by 2 on 2016/10/11.
 */
public class ItemHolder {
    private List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "ItemHolder{" +
                "itemList=" + itemList +
                '}';
    }
}
