import products.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Observer> observerList = new ArrayList<>();
    private List<ShopItem> itemList = new ArrayList<>();

    void insertItem(ShopItem item) {
        this.itemList.add(item);
        if (item.isForAdult()) {
            notifyAllObserver();
        }
    }

    public List<ShopItem> getItemList() {
        return itemList;
    }

    public int getTotalPrice() {
        int result = 0;
        for (ShopItem anItemList : itemList) {
            result = result + anItemList.getPrice();
        }
        return result;
    }

    public void subscribe(Observer observer) {
        this.observerList.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer item : observerList) {
            item.upDate();
        }
    }
}
