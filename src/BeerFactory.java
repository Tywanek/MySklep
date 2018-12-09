import enums.BeerSize;
import enums.BeerType;
import products.Beer;

public class BeerFactory {

    public Beer getBeer(BeerType type, BeerSize size) {
        Beer result = new Beer();
        switch (type) {
            case LIGHT:
                result.setBeerSize(size);
                result.setName("Leszek");
                result.setBeerType(BeerType.LIGHT);
                result.setPrice(setSizePrice(size));
                result.setIsForAdult(true);
                break;
            case DARK:
                result.setBeerSize(size);
                result.setName("Fortuna");
                result.setBeerType(BeerType.DARK);
                result.setPrice(setSizePrice(size));
                result.setIsForAdult(true);
                break;
            case NONALCO:
                result.setName("Woda");
                result.setBeerSize(size);
                result.setPrice(setSizePrice(size));
                result.setBeerType(BeerType.NONALCO);
                result.setIsForAdult(false);
                break;
        }
        return result;
    }

    private int setSizePrice(BeerSize size) {
        int result = 0;
        if (size == BeerSize.SMALL) {
            result = 5;
        } else if (size == BeerSize.BIG) {
            result = 10;
        }
        return result;
    }


}
