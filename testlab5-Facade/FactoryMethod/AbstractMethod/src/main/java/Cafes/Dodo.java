package Cafes;


import beverages.Beverage;
import beverages.CocaCola;
import pizza.Pepperoni;
import pizza.Pizza;

public class Dodo implements Cafe {
    @Override
    public Beverage getBeverage() {
        return new CocaCola();
    }

    @Override
    public Pizza getPizza() {
        return new Pepperoni();
    }
}
