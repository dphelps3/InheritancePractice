
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
                                    empIDNumber, int empZip) {
        super(empFirstName, empLastName, empBirthdate, empAddress, 
                empCity, empState, empEmail, empPhone, empDept, empIDNumber, 
                empZip);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
 
 
    }

