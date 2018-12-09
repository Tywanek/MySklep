public class AdultObserver extends Observer {

    public AdultObserver(ShoppingBasket subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    void upDate() {
        System.out.println("UWAGA!!!!");
    }
}
