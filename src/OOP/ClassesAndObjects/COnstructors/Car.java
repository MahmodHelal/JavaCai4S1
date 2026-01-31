package OOP.ClassesAndObjects.COnstructors;

public class Car {
    //attributes

    public String color;
    public String brand;
    public int year;
    public String model;


    // constructor -> special method run once object is created
    //accessModifier nameOfClass(param){
    // blockOfCode
    // }

    //constructor -> default
    public Car(String color, String brand){
/*        this.color = color;
        this.brand = brand;*/
        this(color,brand,2030);

    }

    public Car(String color, String brand, int year, String model){
        this(color,brand);
        this.year = year;
        this.model = model;

    }
    public Car(String color, String brand, int year){
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    public Car(){}

/*    public Car(String color, String brand, int year, String model){
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
    }
    public Car(String color, String brand, int year, String model){
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
    }*/


/*     int add(int num1 , int num2){
        return 0;
    }*/


/*    public static void main(String[] args) {
        Car car = new Car();

        car.drive();
    }*/




    //Methods
    public void drive(){
        System.out.println(model +" is driving");
    }



    public void displayInfo(){


        System.out.println("Color : " + this.color);
        System.out.println("Brand : " + brand);
        System.out.println("Year : " + year);
        System.out.println("Model : " + model);
    }



}
