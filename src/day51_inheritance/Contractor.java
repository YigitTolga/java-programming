package day51_inheritance;

public class Contractor extends Employee {
<<<<<<< HEAD

    public double calculateSalary(double hourlyRate) {
        return (50 * 40) * hourlyRate;
=======
     //1) lets everyone know that you are overriding this method
     //2) ensures that this method is being overridden. if not, it shows ERROR
     @Override
    public double calculateSalary(double hourlyRate) {
       return 50 * 40 * hourlyRate;
>>>>>>> 752503a9ec23c351c259ee3291615b26c855299d
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
