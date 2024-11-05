package Ilagan_Exercise_6_1;

abstract class Employee {
    protected double hourlyRate;
    
    public Employee(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public abstract double calculatePay();
}
