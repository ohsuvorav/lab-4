package ohsuvorov.pizza;

public class Pizza {
    private final String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void cookPizza() {
        System.out.println("Here you are, your " + this.name.toString() + "!");
    }
}
