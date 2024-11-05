package Ilagan_Exercise_6_1;

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double hourlyRate, double monthlySalary) {
        super(hourlyRate);
        this.hourlyRate = 0; 
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}