package Ilagan_Exercise_6_1;

class PartTimeEmployee extends Employee {
    private double hoursWorked;

    public PartTimeEmployee(double hourlyRate, double hoursWorked) {
        super(hourlyRate);
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
