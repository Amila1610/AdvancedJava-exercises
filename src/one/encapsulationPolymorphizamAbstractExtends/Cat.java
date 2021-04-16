package one.encapsulationPolymorphizamAbstractExtends;

public class Cat extends Animals{
    public Cat(int id, String name) {
        super(id, name);
        System.out.println("A cat is created...");

    }

    @Override
    public void playSound() {
        System.out.println("Cat: mjau mjau");
    }
}
