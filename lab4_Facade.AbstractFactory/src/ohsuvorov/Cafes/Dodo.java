package ohsuvorov.Cafes;

import ohsuvorov.beverages.Beverage;
import ohsuvorov.beverages.CocaCola;
import ohsuvorov.pizza.Pepperoni;
import ohsuvorov.pizza.Pizza;

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
