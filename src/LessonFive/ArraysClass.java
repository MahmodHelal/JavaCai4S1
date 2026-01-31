package LessonFive;

import java.util.Scanner;

public class ArraysClass {

    public static void main(String[] args) {


        int number1 =1;
        int number2 =2;
        int number3 =3;
        int number4 =4;
        int number5 =5;
        int number6 =6;

/*        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of Array");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        for (int i =0 ; i< arr.length; i++){
            System.out.print("Please enter " + (i+1) + " number  :- ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("********************");
        for (int element : arr){
            System.out.print(element + "\t");
        }
        */
//        size = 15;









//        int[] numbers = {1,2,3,4,5,6}; // nonpr



/*        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);*/

//        System.out.println(numbers[6]);

/*        for (int i =0  ;i < numbers.length ; i++ ){
            System.out.println(numbers[i]);
        }*/

/*

        for (int number : numbers){
            System.out.println(number);
        }
//

        String[] fruits = new String[4];

        System.out.println("Before Assign");
        for (String fruit : fruits){
            System.out.println(fruit);
        }


        fruits[0]= "Apple";
        fruits[1]="Banana";
        fruits[2]= "Orange";
        fruits[3]= "Grape";

        System.out.println("After Assign");
        for (String x : fruits){
            System.out.println(x);
        }
*/

        // for(dataType nameOfVariable : nameOfArray){
        // block of code
        // }



/*        for (int i =0  ;i < fruits.length ; i++ ){
            System.out.println(fruits[i]);
        }


        for (int i =0  ;i < temps.length ; i++ ){
            System.out.println(temps[i]);
        }

        // for each
       */
/*        int[] temps = new int[5];
        int x = 1;
        for (int i =0 ; i<temps.length ; i++){
            temps[i] = x++;
        }*/



     /*   for (int elements : temps){

            elements = x++;


        }*/
/*
        System.out.println("******************");
        System.out.println(temps[3]);
        System.out.println("*****************");
        for (int element : temps){
            System.out.println(element);

        }
*/



/*        System.out.println(numbers.length);
        System.out.println("Fourth Number is "+ numbers[3]);
        System.out.println("Last Element is "+ numbers[5]);
        System.out.println("Last Element is "+ numbers[numbers.length - 1]);

        System.out.println("****************************");
        int[] numbers2 = {10,20,30,40,50};

        System.out.println("Last Element is "+numbers2[4]);
        System.out.println("Last Element is "+numbers2[numbers2.length -1]);*/


/*
        int[] grades  =  {30 ,50 ,70 ,90,52};
        int sum = 0 ;
        for (int grade:  grades){
            sum = sum + grade;
        }
        double average = (double) sum /grades.length;
        System.out.println("Average is "+ average);*/



        // declaration
        // dataType[] nameOfArray;
        int[] grades;


        //initialization
        // nameOfArray  =  new dataType[size];
        grades = new int[5];


        //combined
        // dataType[] nameOfArray  =  new dataType[size];
        int[] grades2 = new int[5];

        //with value
        // dataType[] nameOfArray = {values};
        String[] fruits =  {"Apple" ,  "Banana"};

        System.out.println(fruits[2]);


        System.out.println("Hello World");













        //dataType[] nameOfArray;  //declaration
        //ameOfArray = new dataType[length];  //initialization
        //dataType[] nameOfArray = new dataType[length];  //combined
        //dataType[] nameOfArray = {values}  // with value



/*        //2D

        int[][] arr2D = new int[2][4];

        System.out.println(arr2D[1][1]);
        System.out.println("*******************");


        int[][] grades  =  {
                {1, 2, 3 },
                {4 ,5, 6 , 70 , 77 },
                {7, 8, 9 }
        };
        //

        System.out.print(grades[0][0]+ "\t");
        System.out.print(grades[0][1]+ "\t");
        System.out.print(grades[0][2]+ "\t");
        System.out.println();
        System.out.print(grades[1][0]+ "\t");
        System.out.print(grades[1][1]+ "\t");
        System.out.print(grades[1][2]+ "\t");
        System.out.print(grades[1][3]+ "\t");
        System.out.print(grades[1][4]+ "\t");
        System.out.println();
        System.out.print(grades[2][0]+ "\t");
        System.out.print(grades[2][1]+ "\t");
        System.out.print(grades[2][2]+ "\t");*/




    }
}
