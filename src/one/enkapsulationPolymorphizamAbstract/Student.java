package one.enkapsulationPolymorphizamAbstract;

public class Student extends Person{
    private int indexNumber;

    public Student(){
        System.out.println("I'm creating a student...");
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}
