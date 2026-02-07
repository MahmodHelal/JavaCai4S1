package OOP.ClassesAndObjects.Abstraction;

public class HRSystem {
    public static void main(String[] args) {



        FullTime fullTime = new FullTime("John", 30, 5000);
        Employee partTime = new PartTime("Jane", 25, 20, 160);


        fullTime.displayInfo();
        System.out.println("**************");
        partTime.displayInfo();












    }
}
