package beverages;

public class BeverageFactory {
    public Beverage createBeverage(BeverageName name) {
        Beverage beverage;
        switch (name) {
            case CocaCola-> {
                beverage = new CocaCola();
            }
            case Sprite -> {
                beverage= new Sprite();
            }
            default -> {
                System.out.println("Sorry, we run of " + name.toString());
                beverage=null;
            }
        }

        return beverage;

    }
}
