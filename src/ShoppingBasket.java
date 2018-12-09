import products.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private User user;
    private AdultObserver adultObserver;
    private PrinterObserver printerObserver;
    private List<ShopItem> itemList = new ArrayList<>();

    public ShoppingBasket(User user) {
        this.user = user;
    }

    void insertItem(ShopItem item) {
        this.itemList.add(item);
        notifyMyObservers(item);
    }

    private void notifyMyObservers(ShopItem item) {
        notifyPrinterObserver(item);
        if (item.isForAdult()) {
            notifyAdultObserver();
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

    public void subscribeAdultObserver(AdultObserver observer) {
        this.adultObserver = observer;
    }

    public void notifyAdultObserver() {
        if (adultObserver != null) {
            adultObserver.upDate(user);
        }
    }

    public void subscribePrinterObserver(PrinterObserver observer) {
        this.printerObserver = observer;
    }

    public void notifyPrinterObserver(ShopItem item) {
        if (printerObserver != null) {
            printerObserver.onUpdate(item);
        }
    }

}
