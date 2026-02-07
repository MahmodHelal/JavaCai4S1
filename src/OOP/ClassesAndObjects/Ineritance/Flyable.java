package OOP.ClassesAndObjects.Ineritance;

public interface Flyable {
     int MAX_SPEED = 100;

     void fly();


     default void land(){
        System.out.println(" Duck is Landing");
     }
}
