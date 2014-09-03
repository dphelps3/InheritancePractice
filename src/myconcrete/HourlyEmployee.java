
package myconcrete;

public class HourlyEmployee extends Employee {
    
// variables needed exclusively for hourly employees
 private double hoursWorked;
 private double payRate;

 // Constructor created for new exclusive variables as well as
 // the variables inherited by the superclass
    public HourlyEmployee(double hoursWorked, double payRate, String 
            empFirstName, String empLastName, String empBirthdate, String 
                    empAddress, String empCity, String empState, String 
                            empEmail, String empPhone, String empDept, int 
                                    empIDNumber, int empZip) 
    {
        super(empFirstName, empLastName, empBirthdate, empAddress, 
                empCity, empState, empEmail, empPhone, empDept, empIDNumber, 
                empZip);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
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

