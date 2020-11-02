package ohsuvorov;

import ohsuvorov.Cafes.Cafe;
import ohsuvorov.Cafes.Dodo;
import ohsuvorov.Cafes.Domino;
import ohsuvorov.pizza.Pizza;
import ohsuvorov.pizza.PizzaFactory;
import ohsuvorov.pizza.PizzaName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductsOrderingdViaMobile {
    private static PizzaFactory pizzaFactory = new PizzaFactory();
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
        } while (answer.equalsIgnoreCase("0"));
    }
}
