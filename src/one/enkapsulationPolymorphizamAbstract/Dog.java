package one.enkapsulationPolymorphizamAbstract;

public class Dog extends Animal{

    public Dog(int id, String name) {
        super(id, name);
        System.out.println("The dog has been adopted...");
    }

    @Override
    public void playSound() {
        System.out.println("Dog: aw aw");
    }
}
