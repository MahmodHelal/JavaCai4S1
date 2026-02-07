package OOP.ClassesAndObjects.Abstraction;

public abstract class Employee {
    String name ;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    abstract double calcSalary();



    void displayInfo(){
        System.out.println("Name is :  "+ name);
        System.out.println("Age is : "+ age);
        System.out.println("Salary is : " + calcSalary());
    }
}
