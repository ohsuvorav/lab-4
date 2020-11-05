import Cafes.Cafe;
import Cafes.Dodo;
import Cafes.Domino;
import pizza.Pizza;
import pizza.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductsOrderingdViaMobile {
    static PizzaFactory pizzaFactory = new PizzaFactory();
    static Pizza pizza = new Pizza("first");

    public ProductsOrderingdViaMobile(PizzaFactory pizzaFactory) {
        ProductsOrderingdViaMobile.pizzaFactory = pizzaFactory;
    }


    public static void orderProduct(String chosenrestaraunt) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = null;
        do {
            Cafe chosenCafe = null;
            if (chosenrestaraunt.contains("1")) {
                chosenCafe = new Dodo();
                System.out.println("\nWelcome to DodoPizza\n What would you like to eat now?\n1 for Pizza\n2 for Beverage");
                answer = br.readLine();
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
            } else if (chosenrestaraunt.contains("2")) {
                chosenCafe = new Domino();
                System.out.println("\nWelcome to Domino'sPizza\n What would you like to eat now?\n1 for Pizza\n2 for Beverage");
                answer = br.readLine();
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
            else {
                System.out.println("Watchout you texted the wrong number\nTry one more time");
                chosenrestaraunt= br.readLine();
            }
        } while (answer.equalsIgnoreCase("0"));
    }
}
