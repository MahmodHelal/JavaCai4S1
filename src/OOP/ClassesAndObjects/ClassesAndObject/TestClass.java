package OOP.ClassesAndObjects.ClassesAndObject;

public class TestClass {
    public static void main(String[] args) {
        //nameOfClass nameOfObject = new nameOfClass();

        Person person1 = new Person();

        Person person2 = new Person();

        String x = "Value";
        person1.name = "Helal";
        person1.age = 25;
        person1.gender = "Male";

        System.out.println(x);
        System.out.println(person1.name);

        person1.getName();




        person1.displayInfo();

        person2.name = "Ali";

        person2.sleep();

    }
}

//create a class Student
// attribute are :- name age grade
// methods study and displayInfo
// create 2 objects and use them
