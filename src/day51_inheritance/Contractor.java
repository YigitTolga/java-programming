package day51_inheritance;

public class Contractor extends Employee {

    public double calculateSalary(double hourlyRate) {
        return (50 * 40) * hourlyRate;

        //1) lets everyone know that you are overriding this method
        //2) ensures that this method is being overridden. if not, it shows ERROR

    }



    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
