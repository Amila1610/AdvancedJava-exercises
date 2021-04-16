package one.enkapsulationPolymorphizamAbstract;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private int age;
    private Animal animal;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name !=null && !name.isEmpty()){
            this.name=name;
        }
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

    public void setAge(int godine) {
        if(godine>=0){
            age=godine;
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
