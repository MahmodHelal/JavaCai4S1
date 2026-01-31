package DataTypesPackage;

import Teaching.Main;

public class DataTypesClass {

    static int intNumber; // declaration without initialization
    static double doubleNumber;
    static boolean booleanNumber;
    static String stringNumber;



    public static void main(String[] args) {
        Main nameOfObject = new Main();
        nameOfObject.sayHello();
        nameOfObject.test();
        Main.test();


        System.out.println("integer Number is " + intNumber);
        System.out.println("double Number is " + doubleNumber);
        System.out.println("boolean Number is " + booleanNumber);
        System.out.println("String Number is " + stringNumber);


        //Data Types
        //byte
        //short
        //int
        //long
        //float
        //double


        //boolean


        //char
        //String

    /*    double number1 = 9.9;
        int number2 =10;

        System.out.println((int)number1);
        System.out.println((double) number2);
*/


        byte number = 127; // 1byte
        short shortNumber =32767; //2byte
        int intNumber = 2147483647; //4byte
        long longNumber = 2147483648L;//8byte
        float floatNumber = 3200099999999999999999999999999999.999999999999999f; // 4byte
        double doubleNumber = 3200099999999999999999999999999999999999999999999999999999999.99999999999999999999999999999999999999999999999999999999999999999999999999999999999;


        int number1 = 10;
        int number2 = 10;
        boolean isValid = number1 == number2;




        System.out.println(number1 == number2);
        System.out.println(number1 == number2);
//        System.out.println(number1.equals(number2));


/*        System.out.println("diff address");
        System.out.println(name3 == name4);//false
        System.out.println(name2.equals(name3));//true same content
        System.out.println(name1);
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));*/
        String name1  = "Mahmoud";// literal
        String name2 = "Mahmoud";
        String name3 = new String("Mahmoud");
        String name4 = new String("Mahmoud");
        System.out.println(name2.equals(name3));

        System.out.println("name1 virtual address is :- " + System.identityHashCode(name1) +" name1 value is " + name1);
        System.out.println("name2 virtual address is :- " + System.identityHashCode(name2) +" name2 value is " + name2);
        System.out.println("name3 virtual address is :- " + System.identityHashCode(name3) +" name3 value is " + name3);
        System.out.println("name4 virtual address is :- " + System.identityHashCode(name4) +" name4 value is " + name4);



    }

}
