package OOP.ClassesAndObjects.Ineritance;

public class Bird extends Animal implements Flyable{





    @Override
    void makeSound(){
        System.out.println("Seo Seo");
    }


    @Override
    public void fly() {

    }
}
