package OOP.ClassesAndObjects.ClassesAndObject;

import OOP.ClassesAndObjects.Encpsulation.Person;

public class Employee extends Person {


    public void displayInfo(){
        System.out.println("Name : " + name);
//        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
//        System.out.println("Address : " + address);
    }
}
