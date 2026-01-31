package OOP.ClassesAndObjects.Encpsulation;

public class Person {





    //create a bank account class
    //attributes -> balance , account number , name
    // and hide yor data
    // then add two methods
    // with draw and deposit
    // and test all methods in main





    /// Access Modifiers
    //private -> Same Class
    //default -> Same class + Same Package
    //protected -> Same Class +  Same Package + SubClass
    // public -> Anywhere
    
    //attributes


    //private
    private int age;
    //default
    String address;
    //protected
    protected String name;

    public String gender;



    public void setAge(int num){
        if (num < 18){
            throw  new IllegalArgumentException("Age can't be negative");
//            System.out.println("Age can't be negative the age will be initial value");
        }else {
        age = num;
        }
    }

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
