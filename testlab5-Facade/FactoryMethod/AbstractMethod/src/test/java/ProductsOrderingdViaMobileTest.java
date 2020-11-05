import Cafes.Cafe;
import Cafes.Dodo;
import Cafes.Domino;
import org.junit.Test;
import pizza.Pizza;
import pizza.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProductsOrderingdViaMobileTest {

    @Test(expected = NullPointerException.class)
    public void orderProduct() throws IOException {
        String chosenrestaraunt =null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = null;
        do {
            Cafe chosenCafe = null;
            if (chosenrestaraunt.contains("1")) {
                chosenCafe = new Dodo();
                System.out.println("\nWelcome to DodoPizza\n What would you like to eat now?\n1 for Pizza\n2 for Beverage");

                switch (answer) {
                    case "1" -> {
                        chosenCafe.getPizza().cookPizza();
                    }
                    case "2" -> {
                        chosenCafe.getBeverage().deliverBeverage();
                    }
                    default -> {
                        System.out.println("It seems that you pressed the wrong button");

                    }
                }
            }
        } while (answer.equalsIgnoreCase("0"));
    }
}