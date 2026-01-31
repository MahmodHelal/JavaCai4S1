package LessonTwo;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


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


        //switch(expression){
        // case value1:
        // sout();
        // break;}

        int numberOfDay = 8;

        switch (numberOfDay){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");

            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Day");
        }



        // take from user name o month
        // validate month in winter  or spring or summer or autumn "season"
        // winter : j f m -> january -> march
        // spring : a m j -> april - august
        // summer : j a s -> may  june
        // autumn : o n d
        // just first character of month name in switch case
        // user will enter january or february or march or april or may or june or july or august or september or october or november or december
        // j m f


     /*   System.out.println("Please enter a name of day");
        String nameOfDay = input.nextLine();*/



        // winter : j f m ->  ->
        // spring : a m j -> april -
        // summer : j a s ->  august
        // autumn : o n d
        // just first character of month name in switch case
        // user will enter january or february or march or april or may or june or july or august or september or october or november or december
        // j m f
        String withoutTrim = "     Helal         Helal                    ";
        System.out.println("withouttrim is " + withoutTrim);
        String trimmed =  withoutTrim.trim();
        System.out.println("trimmed is " + trimmed);

           Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name of month");
        String nameOfMonth = input.nextLine();// March -> m // J j
        char firstChar = nameOfMonth.toLowerCase().charAt(0);
        switch (firstChar){
            case 'j', 'f', 'm':
                if (firstChar == 'j' || firstChar == 'm'){
                    if (nameOfMonth.toLowerCase().equals("june")){
                        System.out.println("spring");
                    }else if (nameOfMonth.toLowerCase().equals("july") || nameOfMonth.toLowerCase().equals("may")){
                        System.out.println("summer");
                    }else {
                        System.out.println("Winter");

                    }
                }else {
                    System.out.println("Winter");
                }
                break;
            case  'a':
                if (nameOfMonth.toLowerCase().substring(0,2).equals( "ap")){
                System.out.println("spring");
                }
                else if (nameOfMonth.toLowerCase().charAt(1) == 'u'){
                    System.out.println("summer");
                }
                break;
            case 's', 'o':
                System.out.println("summer");
                break;
            case 'n', 'd':
                System.out.println("autumn");
                break;
            default:
                System.out.println("Invalid Month");
        }



/*        switch (nameOfDay.toLowerCase()){//sunday
            case "saturday" , "friday":
                System.out.println("is Weekend");
                break;
            case "sunday","monday","tuesday","wednesday","thursday":
                System.out.println("is Weekday");
                break;
            default:
                System.out.println("Invalid Day");
        }*/







      /*  //use if to print weekdays
        if(numberOfDay == 1){
            System.out.println("Saturday");
        }else if(numberOfDay == 2){
            System.out.println("Sunday");
        }else if(numberOfDay == 3){
            System.out.println("Monday");
        }else if(numberOfDay == 4){
            System.out.println("Tuesday");
        }else if(numberOfDay == 5){
            System.out.println("Wednesday");
        }else if(numberOfDay == 6){
            System.out.println("Thursday");
        }else if(numberOfDay == 7){
            System.out.println("Friday");
        }*/







    }
}
