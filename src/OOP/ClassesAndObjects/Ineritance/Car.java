package OOP.ClassesAndObjects.Ineritance;

public class Car {
    String model;
    int year;
    String color;
    Engine engine; //composition



    void start(){
        engine.start();
    }


    void displayInfo(){
        System.out.println(model +"has "+ engine.horsePower +"CC");
    }



}
