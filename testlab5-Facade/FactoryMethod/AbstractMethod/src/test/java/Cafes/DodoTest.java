package Cafes;

import beverages.Beverage;
import beverages.CocaCola;
import beverages.Sprite;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodoTest {

    @Test
    public void getBeverage() {

        Dodo beverage = new Dodo();
        assertTrue("Does method of the class Domino return Beverage type?",beverage.getBeverage() instanceof Beverage);
        assertTrue("Does method of the class Domino return CocaCola type?",beverage.getBeverage() instanceof CocaCola);

    }
}