package Cafes;


import beverages.Beverage;
import beverages.Sprite;
import pizza.Arriva;
import pizza.Pizza;

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
