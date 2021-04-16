package one.enkapsulationPolymorphizamAbstract;

public class Cat extends Animal{

    public Cat(int id, String name) {
        super(id, name);
        System.out.println("The cat has been adopted...");
    }

    @Override
    public void playSound() {
        System.out.println("Cat: Mjau Mjau");
    }
}
