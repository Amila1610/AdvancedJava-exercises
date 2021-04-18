package six.designPatterns;

class CocaCola extends Beverage{


    public CocaCola() {
        super("Coca cola");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
