package LessonFour;
import java.util.Scanner;
public class Methods {

    public static void main(String[] args) {
/*        sayHello();
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        printTable(2);
        printTable(6);

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number");
        int number = input.nextInt();
        printTable(number);*/
/*       int result = add(10,15);//call
        System.out.println(result);*/
  /*      result++;
        System.out.println("Result is  :- "+ result);*/
/*

        System.out.println(add(10, 20));


        System.out.println(divide(10,3));
*/
        /// create a calculator method
        // take two number and operator "+" "-" "*" "/"
        // and return result
/*        System.out.println("Hello Students Iam Helal");
        System.out.println("Hello Students Iam Osama");
        System.out.println("Hello Students Iam Ismail");


        int targetNumber = 6;
        for (int i =1; i<= 12; i++){
            System.out.println(targetNumber + " x " + i + " = " + (targetNumber * i));
        }
        targetNumber++;
        for (int i =1; i<= 12; i++){
            System.out.println(targetNumber + " x " + i + " = " + (targetNumber * i));
        }
        int x =8 ;
        for (int i =1; i<= 12; i++){
            System.out.println(x + " x " + i + " = " + (x * i));
        }


        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");*/
      /*  System.out.println(calc(10,20,'+'));
        System.out.println(calc(10,20,'*'));
        System.out.println(calc(10,20,'-'));*/
/*        System.out.println(calc(20,0,'/'));

        double x =add(3,4);

        add(3,4);

        System.out.println(add(3,4));*/


        for (int i = 0 ; i<=5 ; i++){
            System.out.println(i);
        }





    }

/*
    //accessModifier staticOrNonstatic returnType nameOfMethod(parameter){
    // block of code
    // }
    // public                          //void
    // protected                       // int
    // default
    // private
*/
    public static int calc(int num1, int num2, char symbol ){
        switch (symbol){
            case '+':
                return num1+ num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
//             if (num2 != 0){
                return num1/num2;
    /*         }else {
                 System.out.println("num2 mustn't be zero");
                 return 0;
             }*/
            default:
                System.out.println("Wrong Symbol");
                return 0;
        }
    }
    private static  double divide(int num1, int num2){
        System.out.println(add(10,20));
        return (double) num1 / num2;
    }
    static double add(int num1,double num2){
        int x =10;
        System.out.println(x);



       return num2+num1;
//        return num1+num2;


    }
    public static void sayHello(){
        System.out.println("Hello");
    }
    protected static void printTable(int targetNumber ){
        for (int i =1; i<= 12; i++){
            System.out.println(targetNumber + " x " + i + " = " + (targetNumber * i));
        }
    }



}
