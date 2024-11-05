package Ilagan_Exercise_6_1;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(0, 5000); 
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(20, 80); 
        Contractor contractor = new Contractor(30, 100); 

        System.out.println("Full-Time Employee Pay: $" + fullTimeEmployee.calculatePay());
        System.out.println("Part-Time Employee Pay: $" + partTimeEmployee.calculatePay());
        System.out.println("Contractor Pay: $" + contractor.calculatePay());
    }
}