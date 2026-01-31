package OOP.ClassesAndObjects.Ineritance;

public class MainInherit {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Model S";
        car.brand = "Tesla";
        car.year = 2022;
        car.price = 100000;
        car.start();
        car.stop();

        car.destination("New York");

        System.out.println("***********");
        System.out.println("***********");


        Truck truck = new Truck();
        truck.brand = "Mercedes";
        truck.year = 2024;
        truck.color = "Black";
        truck.model = "G Class";
        truck.price = 200000;
        truck.start();
        truck.stop();
        System.out.println("***********");
        System.out.println("***********");
        truck.loadCargo();



        Motorcycle motorcycle = new Motorcycle();
        motorcycle.brand = "Harley Davidson";
        motorcycle.year = 2025;
        motorcycle.color = "Black";
        motorcycle.model = "Street 750";
        motorcycle.price = 20000;
      motorcycle.start();
      motorcycle.stop();


    }
}
