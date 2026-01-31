package LessonTwo;

import java.util.Scanner;

public class IFCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // accept greater than 18

        // if (condition){
        // block of code when condition true
        // }

        //if(condition){
        // block of code when condition true
        // }else{
        // block of code when condition false
        // }

        //if (condition){
        // block of code when condition true
        //else if(condition){
        // block of code when condition true
        // }
/*
        int age = 18;

        if (age > 18) {
            System.out.println("eligible for vote");
        }else {
            System.out.println("not eligible for vote");
        }
*/
/*        int grade = 70;

        if (grade >= 60) {
            System.out.println("Fail");
        } else if (grade >= 90){
            System.out.println("Excellent");
        }else if(grade >= 80){
            System.out.println("Very Good");
        } else if (grade >= 70) {
            System.out.println("Good");
        }else {
            System.out.println("Invalid Grade");
        }


        System.out.println("After If");*/


/*        // store expected userName and password
        String expectedUsername = "admin";
        String expectedPassword = "123";
        // ask user to enter userName and password


        // validate if username and password correct print login success
        // else print login failed
*//*        if (expectedUsername.equals(username) && !expectedPassword.equals(password)){
            System.out.println("Login Success");
        }else {
            System.out.println("Login Failed");
        }*//*
        //bonus validate incorrect password message
        System.out.println("please enter username");
        String username = input.nextLine();

        System.out.println(System.identityHashCode(username));
        System.out.println("*******************");
        System.out.println(System.identityHashCode(expectedPassword));

        if (username.equals(expectedUsername)){
            System.out.println("please enter password");
            String password = input.nextLine();
            if (expectedPassword.equals(password)){
                System.out.println("Login success");
            }else {
                System.out.println("incorrect password");
            }
        }else {
            System.out.println("Login Failed");
        }*/





        //input username Mohamed password wrong -> wrong password
        // input username Ali Login Fail


    }

}
