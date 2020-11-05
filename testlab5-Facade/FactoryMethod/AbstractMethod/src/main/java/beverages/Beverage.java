package beverages;

public class Beverage {
    private final String name;

    public Beverage(String name) {
        this.name = name;
    }

    public void deliverBeverage() {
        System.out.println("Here you are, your " + this.name.toString() + "!");
    }
}
