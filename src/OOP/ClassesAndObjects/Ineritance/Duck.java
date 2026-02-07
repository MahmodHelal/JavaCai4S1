package OOP.ClassesAndObjects.Ineritance;

public class Duck extends Animal implements Flyable,Swimmable{

    public void fly(){
        System.out.println(" Duck is Flying");
    }

    void makeSound(){
        System.out.println(" Duck is Quacking");
    }

    @Override
    public void swim() {
        System.out.println(" Duck is Swimming");
    }
}
