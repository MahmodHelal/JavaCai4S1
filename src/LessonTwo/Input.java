package LessonTwo;


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String name1 ="Helal";
        String name2 ="Helal";
        String name3 = new String("Helal");

        System.out.println(name1 == name2);// true
        System.out.println(name1 == name3);// false








        Scanner input = new Scanner(System.in);

        // take age from user and print it
    /*    System.out.println("Please enter your age");
        int age = input.nextInt();*/
        System.out.println("Please enter your name ");
        String name = input.next();
        System.out.println(name);
//        System.out.println("please enter first number");
//        int firstNumber = input.nextInt();
//        System.out.println("please enter second number");
//        int secondNumber = input.nextInt();
//        System.out.println("Hello "+ name  +" your age is "+age+ " Your summation is "+ (firstNumber + secondNumber));
//
//        System.out.println("The 18 is odd ? true");

        // without using if statement take from user a number
        // and validate the number is odd or not
        // output will be " the number is odd ? true or false" like it
        // the 15 is odd ? true
        // the 20 is odd ? false






    }

}
