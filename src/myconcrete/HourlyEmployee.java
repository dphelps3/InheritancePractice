
package myconcrete;

public class HourlyEmployee extends Employee {

    // Local variables
    private double hoursWorked; // for hours worked by employee
    private double payRate; // Rate of pay for employee
    
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, String dept, int empID) {
        super(name, dept, empID);
    }
    
    @Override
    public void employeeType() {
        System.out.println("Hourly Employee");
    }
    
    // Methods for setting and getting hoursWorked and payRate
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
 
 
    }

