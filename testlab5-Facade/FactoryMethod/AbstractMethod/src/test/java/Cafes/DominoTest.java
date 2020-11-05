package Cafes;

import beverages.Beverage;
import beverages.CocaCola;
import beverages.Sprite;
import org.junit.Test;

import static org.junit.Assert.*;

public class DominoTest {

    @Test
    public void getBeverage() {
        Domino beverage = new Domino();
        assertTrue("Does method of the class Domino return Beverage type?",beverage.getBeverage() instanceof Beverage);
        assertTrue("Does method of the class Domino return Sprite type?",beverage.getBeverage() instanceof Sprite);
    }
}