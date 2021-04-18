package six.designPatterns;

class MilkDecorator extends Beverage{
private Beverage beverage;

    public MilkDecorator(Beverage espresso) {
        super(espresso.getName()+ " with milk");
        this.beverage=espresso;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
