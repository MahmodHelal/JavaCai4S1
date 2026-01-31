package OOP.ClassesAndObjects.ClassesAndObject;

public class Person {
    
    //attributes

    public int age;
    //default
    String address;
    public String name;
    public String gender;

    // methods
    public void getName(){
        System.out.println(" name is "+ name);
    }


    //default
     public void sleep(){
        System.out.println(name + " is sleeping");
    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void study(){
        System.out.println(name + " is studying");
    }



    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }






}
