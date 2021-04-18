package six.designPatterns;

public class Executor {
    public static void main(String[] args) {

       /* 1. način
        Espresso espresso=new Espresso();
        tasteTheDrink(espresso);
        Beverage anasDrink=new MilkDecorator(espresso);
        tasteTheDrink(anasDrink);
    }
    static void tasteTheDrink(Beverage espresso){
        System.out.println("I drink: " + espresso.getName() + "and it costs me " + espresso.cost());
    }*/

       /* 2.način
        Beverage espresso = BeverageFactory.getBeverage("Espresso");
        tasteTheDrink(espresso);
    }
    static void tasteTheDrink(Beverage espresso) {
        System.out.println("I drink: " + espresso.getName() + "and it costs me " + espresso.cost());
    }*/

        Beverage espresso1 = BeverageEnumFactory.ESPRESSO_FACTORY.getBeverage();
        tasteTheDrink(espresso1);
        Beverage espressoMilk=BeverageEnumFactory.ESPRESSO_MILK_FACTORY.getBeverage();
        tasteTheDrink(espressoMilk);
    }
    static void tasteTheDrink(Beverage espresso) {
        System.out.println("I drink: " + espresso.getName() + " and it costs me " + espresso.cost());
    }
}
