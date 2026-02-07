package OOP.ClassesAndObjects.Abstraction;

public  class PartTime extends Employee  {
    double hourlyRate;
    int hours;


    public PartTime(String name, int age,double hourlyRate, int hours) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    double calcSalary() {
        return hourlyRate * hours;
    }
}
