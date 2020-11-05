package pizza;

public class PizzaFactory {
    public Pizza createProduct(PizzaName name) {
        Pizza pizza = null;
        switch (name) {
            case Chorizzo -> {
                pizza = new HotDogPizza();
                toShow();
            }
            case Pepperoni -> {
                pizza = new Pepperoni();
                toShow();
            }
            case Arriva -> {
                pizza = new Arriva();
                toShow();
            }
            default -> throw new RuntimeException("Sorry, we don't have such a product");
        }
        return pizza;
    }

    public static void toShow() {
        System.out.println("Createad in Product Factory");
    }
}
