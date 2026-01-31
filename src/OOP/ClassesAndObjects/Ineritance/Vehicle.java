package OOP.ClassesAndObjects.Ineritance;

public class Vehicle {
    String color;
    String model;
    String brand;
    int year;
    double price;

    void start(){
        System.out.println(brand+ " " +model +" is starting");
    }

    void stop(){
        System.out.println(brand+ " " +model +" is stopped");
    }

}
