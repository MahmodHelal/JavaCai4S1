package OOP.ClassesAndObjects.Ineritance;

public class GizaZoo {
    public static void main(String[] args) {


        Animal animalAnimal = new Animal();

        Animal animalDog = new Dog();

        Dog dogDog = new Dog();






















        /*Book Management System (Using Inheritance)
Class 1: Book
Create a class called Book that contains:
Attributes:
Title Author Price Number of pages Publisher
Constructor:
A constructor that initializes all attributes
Methods:
displayInfo
Displays all book details
applyDiscount
Applies a discount to the book price
isLongBook
Returns whether the book is considered a long book
Inheritance Part
Class 2: EBook (Child Class)
Create a class called EBook that inherits from Book and adds:
Additional Attribute:
File size
Requirements:
Must use the parent constructor
Must override displayInfo to include the file size
Class 3: PrintedBook (Child Class)
Create a class called PrintedBook that inherits from Book and adds:
Additional Attribute:
Cover type
Requirements:
Must use the parent constructor
Must override displayInfo to include the cover type
Main Class Requirements
In the main method:
Create an array of Book objects
Add the following objects to the array:
One Book One EBook One PrintedBook
Use a loop to:
Display information for all books
Check which books are considered long books
Apply a discount to one book from the array*/








        animalAnimal.name = "animalAnimal";
        dogDog.name = "dogDog";
        animalDog.name = "animalDog";

//        animalAnimal.makeSound(); //
        animalDog.makeSound(); //
      /*  dogDog.makeSound();//*/
        Dog dog123 = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        //        Dog dog = new Dog();




        dog123.name = "DogName";
        dog123.age = 12;

        cat.name = "CatName";
        cat.age= 10;

        bird.name = "BirdName";
        bird.age = 5;


        //Animal is class String is class -> data Type ?\


        String[] names  = {"Ali", "Mo", "rashford"};

        for(String name : names){
            System.out.println(name);
        }




        Animal[] animals = {dog123, cat , bird,animalDog,dogDog};

        System.out.println("Name Of Dog123 :- "+ animals[0].name );




/*        dog123.displayInfo();
        dog123.makeSound();

        for (Animal animal : animals){
            animal.displayInfo();
            animal.makeSound();
            System.out.println("************");


        }

        System.out.println("************");
        System.out.println("************");
        System.out.println("************");



        for (int i = 0; i < animals.length ; i++){
            animals[i].displayInfo();
            animals[i].makeSound();



        }*/


















//
//
//

//
//
//
//        dog.displayInfo();
//        cat.displayInfo();
//        bird.displayInfo();
//        System.out.println("***********");
//
//        dog.makeSound();
//        cat.makeSound();
//        bird.makeSound();
//        System.out.println("***********");
//
//        dog.fetch();
//        cat.escape();
//        bird.fly();
//        System.out.println("***********");
//


    }
}
