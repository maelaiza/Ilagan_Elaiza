package Ilagan_Exercise_6_1;

class Contractor extends Employee {
    private double hoursWorked;

    public Contractor(double hourlyRate, double hoursWorked) {
        super(hourlyRate);
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
