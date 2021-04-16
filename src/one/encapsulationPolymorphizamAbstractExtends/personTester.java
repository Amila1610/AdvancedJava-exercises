package one.encapsulationPolymorphizamAbstractExtends;
import one.encapsulationPolymorphizamAbstractExtends.Animals;

public class personTester {
    public static void main(String[] args) {

        Person p1= new Person();
        p1.setName("Ana");
        p1.setAge(33);
        p1.setSurname("Anić");
        /*int p1Age= p1.getAge();
        System.out.println(p1Age);*/
        printPerson(p1);

        Cat p1cat=new Cat(1,"Tom");
        p1.setAnimals(p1cat);
        printAnimals(p1cat);


        Person p2= new Person();
        p2.setName("Ena");
        p2.setAge(26);
        p2.setSurname("Enic");
        printPerson(p2);

        Dog p2Dog= new Dog(1,"Buddy");
        p2.setAnimals(p2Dog);
        printAnimals(p2Dog);


        Student s1=new Student();
        s1.setName("John");
        s1.setSurname("Jonson");
        s1.setIndexNumber(241011);
        printPerson(s1);

        Profesor a1=new Profesor();
        a1.setName("Mario");
        a1.setSurname("Maric");
        a1.setSalaryAmount(1000.0);
        printPerson(a1);

        Cat a1cat=new Cat(11,"Kitty");
        a1.setAnimals(a1cat);
        Dog a1dog= new Dog(22, "Bingo");
        a1.setAnimals(a1dog);
        printAnimals(a1cat);
        printAnimals(a1dog);


    }
    static void printPerson(Person person){
        System.out.println(person.getName()+" "+person.getSurname()+" "+person.getAge());
    }
    static void printAnimals(Animals animals){
        System.out.println("Animal id:" + animals.getId()+" "+ "animal name:" + animals.getName());
    }

}
