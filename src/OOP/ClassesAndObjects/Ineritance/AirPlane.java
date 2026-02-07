package OOP.ClassesAndObjects.Ineritance;

public class AirPlane extends Vehicle implements Flyable{
    @Override
    public void fly() {
        System.out.println("AirPlane is Flying");
    }
}
