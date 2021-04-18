package six.designPatterns;

public enum BeverageEnumFactory {
    ESPRESSO_FACTORY(new Espresso()),
    TEA_FACTORY(new Tea()),
    COCA_COLA_FACTORY(new CocaCola()),
    ESPRESSO_MILK_FACTORY(new MilkDecorator(new Espresso())),
    TEA_MILK_FACTORY(new MilkDecorator(new Tea()));

    private Beverage beverage;
    private BeverageEnumFactory(Beverage beverage){
        this.beverage=beverage;
    }

    public  Beverage getBeverage(){
        return beverage;
    }
}
