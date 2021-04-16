package one.encapsulationPolymorphizamAbstractExtends;

public class Dog extends Animals{

    public Dog(int id, String name) {
        super(id, name);
        System.out.println("A dog is created...");
    }

    @Override
    public void playSound() {
        System.out.println("aw aw aw");

    }
}
