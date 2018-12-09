package products;

import enums.PizzaAdditive;
import enums.PizzaSos;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements ShopItem {
    private String name;
    private int price;
    private PizzaSos sos;
    private List<PizzaAdditive> additives;

    public Pizza(PizzaBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.sos = builder.sos;
        this.additives = builder.additives;
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
        return false;
    }

    public PizzaSos getSos() {
        return sos;
    }

    public void setSos(PizzaSos sos) {
        this.sos = sos;
    }

    public List<PizzaAdditive> getAdditives() {
        return additives;
    }

    public void setAdditives(PizzaAdditive additive) {
        this.additives.add(additive);
        this.price = this.price + 1;
    }

    public static class PizzaBuilder {
        private String name;
        private int price;
        private PizzaSos sos;
        private List<PizzaAdditive> additives;

        public PizzaBuilder() {
            this.additives = new ArrayList<>();
        }

        public PizzaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PizzaBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public PizzaBuilder setSos(PizzaSos sos) {
            this.sos = sos;
            return this;
        }

        public PizzaBuilder setAdditives(PizzaAdditive additive) {
            this.additives.add(additive);
            this.price = this.price + 1;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
