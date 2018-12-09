package products;

import enums.BeerSize;
import enums.BeerType;

public class Beer implements ShopItem {
    private String name;
    private int price;
    private BeerType beerType;
    private BeerSize beerSize;
    private boolean isForAdult;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean isForAdult() {
        return isForAdult;
    }

    public void setIsForAdult(boolean forAdult) {
        isForAdult = forAdult;
    }

    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }

    public BeerSize getBeerSize() {
        return beerSize;
    }

    public void setBeerSize(BeerSize beerSize) {
        this.beerSize = beerSize;
    }
}
