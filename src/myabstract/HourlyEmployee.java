
package myabstract;

public class HourlyEmployee extends Employee {
    
    // private variables
    private int empID;
    private String name;
    private String dept;
    
    // variables used exclusively for hourly employee
    private double hoursWorked;
    private double payRate;
    
    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String name, String dept) {
        super(empID, name, dept);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    
    // We cannot forget to do this. Inheriting an abstract method forces us
    // to do this. Try commenting this method out and see how you get an
    // error.
    @Override
    public void displayEmployeeType() {
        System.out.println("Hourly Employee");
    }
    
    // Accessors and mutators for the hourly employee variables
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
        // validation needed for name
        this.payRate = payRate;
    }
    
    public double displayHourlyEmployeePay() {
        return payRate * hoursWorked;
    }
    
}