package LessonThree;

import java.util.Scanner;

public class Loops {
public static  void sayHello(){
    System.out.println("Hello");
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//    sayHello();

/*        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);*/
/*
        Scanner input = new Scanner(System.in);
        int x = (int) Math.pow(3,4);
        //2 ^ 3  = 2 * 2 * 2

        System.out.println("please enter base number ");
        int baseNumber = input.nextInt();
        System.out.println("Please enter power number");
        int powerNumber = input.nextInt();
        int resultOfPower = 1;

        for (int i = 1; i <= powerNumber ; i++ ){ // i++ // ++i   //i = i+1 // i+=1
            resultOfPower *= baseNumber; // result = result * baseNumber
        }
        System.out.println("our loop :- "+resultOfPower);
        System.out.println("built in method :- " + x);*/

        /*
        //1 -> 5
        System.out.println("*****************");

        for (int i = 1; i <= 5 ; System.out.println("++i :- " + (++i))){ // i++ // ++i   //i = i+1 // i+=1

            System.out.println(i);
        }

        //2 -> 5*/

/*

        // for // while  // do while

        // for ( initialization ; condition ; update ){
        // block of code
        // }
        int x = 10;

        x++; // x now = 10 next statement will be 11

        ++x;// now 12

        System.out.println(x++); // output 12 and x will be 13 for next statement  x = x+1

        System.out.println(x +1); // output will be 14 but x still 13


        System.out.println(x);//13


        System.out.println(++x);//14

        System.out.println(x/=2);
        System.out.println(x);

        // x = x+1 ->  x+=1

        // x = x + 2-> x+=2

        // y = y *3 -> y*=3

        // z = z-4 ->   z-=4
*/

        // 6 * 1 = 6
        // 6 * 2 = 12
        // ..
        //..
        // 6 * 12 = 72
        // 7 * 1 = 7
        // 7 * 2 = 14
        // ..
        // 7 * 12 = 84
/*
        for ( int i = 1 ; i<= 12 ; i++){

            for ( int j = 1 ; j<= 12 ; j++){

                System.out.println(i + " x " +j + " = " + (i * j));




            }
            System.out.println("**************");
        }*/

/*
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
/*

        int x = 10;
//        int x = 10;

*/
/*        for (int i = 1; i <= 5; i++ ){
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++ ){
            System.out.println(i);
        }*//*


        int i = 1;
        while (i <=5){
            System.out.println(i);
            i++;
        }

        System.out.println(i);
        for (int j = 1; j<= 5 ; j++){
            i++;
        }


        System.out.println(i);
*/

/*        int i = 1;
        while (i <=5){
            System.out.println(i);
            i++;
        }*/

        // do while

     /*   int i = 0;

        do {
            System.out.println(i);
            i++;
        }while (i<= 5);
*//*
        Scanner input = new Scanner(System.in);
        String expectedPassword = "admin123";
        int maxTries = 3;
        int attempt = 0; //1
        String enteredPassword; // declaration
        do {
            System.out.println("Please enter Your Password");
             enteredPassword = input.nextLine(); // initialization
            attempt++;
            if (enteredPassword.equals(expectedPassword)){
                System.out.println("You Logged In");
            }else {
                System.out.println("Wrong password");
                System.out.println("Left "+ (maxTries - attempt));
            }
        }while (attempt< maxTries && !enteredPassword.equals(expectedPassword));


        if (!enteredPassword.equals(expectedPassword)){
            System.out.println("Account is locked");
        }
*/


        //declare
        // dataType  nameOfVariable;
        //initialization
        // nameOfVariable = value;
/*

        int x; // declaration
        x = 10; // initialization
        int y = 10; // declaration and initialization

*/

        // * * * *
        // * * *
        // * *
        // *


/*        for (int i = 1; i<=4 ; i++){
            for (int j = 4 ; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        // break  -> exit loop
        // continue -> skip current iteration and go to next one
/*        for (int i = 1; i<=10; i++){
            System.out.println(i);
            if (i == 6){
                break;
            }
            if (i == 3){
                continue;
            }
        }*/

        // enter
        // 10 , 20, 33 , 40 , 0
//        System.out.println(10+20+40);//70
/*

        int sum =0;
        for (int i = 1 ; i<=10 ;i++){

            System.out.println("Please enter a "+i+" number");

            int number = input.nextInt();

            if (number % 2 != 0){

                continue;

            }else if (number == 0){
                break;
            }
            sum = sum + number; // update

        }

        System.out.println("Sum of evens is " + sum);
*/

        // take 10 numbers from user
        //ignore odds
        //exit when user enter 0
        // print the sum of evens




    }









}
