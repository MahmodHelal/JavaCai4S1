package LessonFive;

public class GradeManagementSystem {


    // create method to find highest grade
    public static int findHighest(int[] grades){
        int max = grades[0];
        for (int grade : grades){
            if (grade > max){
                max = grade;
            }
        }
        return  max;
    }

    // create method to find lowest grade
    public static int findLowest(int[] grades){
        int min = grades[0];
        for (int grade : grades){
            if (grade < min){
                min = grade;
            }
        }
        return  min;
    }

    // create method to find average grade
    public static double findAverage(int[] grades){
        int sum = 0 ;
        for (int grade:  grades){
//            sum = sum + grade;
            sum+=grade;
        }
        return  (double) sum /grades.length;
    }


    // create method to count passed students ">=50"
    public static int countPassed(int[] grades){
        int count = 0;
        for (int grade : grades){
            if (grade >= 50){
                count++;
            }
        }
        return count;
    }


    // create method to find count of students
    public static int countStudents(int[] grades){
        return grades.length;
    }

    public static void main(String[] args) {

        int[] grades = {85, 45,90,78,33,66,55,44,99,70};

        System.out.println("The highest grade is "+ findHighest(grades));
        System.out.println("The lowest grade is "+ findLowest(grades));
        System.out.println("The average grade is "+ findAverage(grades));
        System.out.println("The count of passed students is "+ countPassed(grades));
        System.out.println("The count of students is "+ countStudents(grades));

    }

    // main method insert an array with values and call all methods


}
