package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        System.out.println(developer.calculateSalary(55.0));
        Contractor sdet = new Contractor();
        System.out.println(sdet.calculateSalary(55.0));

    }
}
