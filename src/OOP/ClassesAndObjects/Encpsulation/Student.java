package OOP.ClassesAndObjects.Encpsulation;

public class Student {
    String name;
    private int age;
    double gpa;
    char grade;


    //AccessModifier nameOfClass(){
    // blockOfCode
    //}
//OverLoading

    public Student(String name, int age, double gpa, char grade) {
        setName(name);
        setAge(age);
        setGpa(gpa);
        setGrade(grade);
    }

    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    void setAge(int age){
        if (age > 0 && age < 90 ){
            this.age = age;
        }else{
            System.out.println("Invalid age age will be Zero");
        }

    }


    double getAge(){
        return age;
    }


    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("GPA : " + gpa);
        System.out.println("Grade : " + grade);
    }



}
