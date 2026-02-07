package OOP.ClassesAndObjects.Abstraction;

public class FullTime extends Employee{
    private double salary;


    public FullTime(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    double calcSalary() {
       return salary;
    }
}
