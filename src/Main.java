import enums.BeerSize;
import enums.BeerType;
import enums.PizzaAdditive;
import enums.PizzaSos;
import products.Beer;
import products.Pizza;

public class Main {

    static ShoppingBasket koszyk;
    static BeerFactory beerFactory;


    public static void main(String[] args) {

        User andrzej = new User.UserBuilder()
                .setUserName("Andrzej")
                .setUserAge(15)
                .build();

        koszyk = new ShoppingBasket(andrzej);
        beerFactory = new BeerFactory();

        new AdultObserver(koszyk);
        new PrinterObserver(koszyk);


        Pizza rzeznicka = new Pizza.PizzaBuilder()
                .setName("Rzeznicka")
                .setPrice(30)
                .setSos(PizzaSos.TOMATO)
                .setAdditives(PizzaAdditive.DOUBLE_CHEESE)
                .setAdditives(PizzaAdditive.EXTRA_ONION)
                .build();

        Beer piwo1 = beerFactory.getBeer(BeerType.DARK, BeerSize.SMALL);
        Beer piwo2 = beerFactory.getBeer(BeerType.LIGHT, BeerSize.SMALL);

        koszyk.insertItem(rzeznicka);
        koszyk.insertItem(piwo1);
        koszyk.insertItem(piwo2);

        System.out.println("Cena total: " + koszyk.getTotalPrice());
    }
}
