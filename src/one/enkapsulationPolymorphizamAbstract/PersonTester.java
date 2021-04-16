package one.enkapsulationPolymorphizamAbstract;

public class PersonTester {
    public static void main(String[] args) {


        Person p1 = new Person();
        Cat p1Cat = new Cat(1, "Tom");
        p1.setAnimal(p1Cat);
        p1.setAge(33);
        int p1Age = p1.getAge();
        p1.setName("Ana");
        p1.setSurname("Anich");
        printPerson(p1);
        System.out.println("Person " + p1.getName() + " is : " + p1Age + " years old.");
        printAnimal(p1Cat);


        Person p2 = new Person();
        p2.setName("Ena");
        p2.setSurname("Enich");
        p2.setAge(26);

        Dog dog = new Dog(1, "Bingo");
        p2.setAnimal(dog);
        printPerson(p2);
        Profesor a1 = new Profesor();
        a1.setName("Mario");
        a1.setSurname("Marich");
        Cat c2 = new Cat(215, "Kitty");
        Dog d2 = new Dog(111, "Ajax");
        printPerson(a1);
        printAnimal(d2);
        printAnimal(c2);
    }

    static void printPerson(Person person) {
        System.out.println("The person who adopted the animal is called " + person.getName() + " " + person.getSurname());
    }

    static void printAnimal(Animal animal) {
        System.out.println("Animal's name is: " + animal.getName());
    }
}
