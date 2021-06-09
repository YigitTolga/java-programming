package day51_inheritance;

public class Employee {
    String jobTitle;
    public double calculateSalary(double hourlyRate){
        double salary = (52*40)*hourlyRate*1.1;
       // salary+=salary/100*10;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
