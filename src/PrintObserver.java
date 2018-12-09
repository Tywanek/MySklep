import products.ShopItem;

public abstract class PrintObserver {
    protected ShoppingBasket subject;
    abstract void onUpdate(ShopItem item);
}
