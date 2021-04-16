package one.encapsulationPolymorphizamAbstractExtends;

public class Profesor extends Person{
//Extends
    private double salaryAmount;

    public Profesor(){
        System.out.println("Create profesor...");
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
