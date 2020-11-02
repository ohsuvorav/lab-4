package ohsuvorov.Cafes;

import ohsuvorov.beverages.Beverage;
import ohsuvorov.beverages.Sprite;
import ohsuvorov.pizza.Arriva;
import ohsuvorov.pizza.Pizza;

public class Domino implements Cafe {
    @Override
    public Beverage getBeverage() {
        return new Sprite();
    }

    @Override
    public Pizza getPizza() {
        return new Arriva();
    }
}
