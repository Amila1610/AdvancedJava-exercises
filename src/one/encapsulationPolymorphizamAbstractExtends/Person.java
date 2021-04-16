package one.encapsulationPolymorphizamAbstractExtends;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String surname;
    private int age;
    private Animals animals;

    public Person() {
        System.out.println("Create person...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        if(age>=0){
            age=age1;
        }
    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }
}
