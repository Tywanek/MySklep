import products.ShopItem;

public class PrinterObserver extends PrintObserver {

    public PrinterObserver(ShoppingBasket subject) {
        this.subject = subject;
        this.subject.subscribePrinterObserver(this);
    }

    @Override
    void onUpdate(ShopItem item) {
        System.out.println("Dodano nowy produkt: " + item.getName());
    }
}
