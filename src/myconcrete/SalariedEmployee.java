
package myconcrete;

public class SalariedEmployee extends Employee {
    
// variables needed exclusively for hourly employees
 private double yearlySalary;
 private double stipends = yearlySalary / 24; // Yearly salary divided
                        // by 24 ( Employee is paid twice a month)

 // Constructor created for new exclusive variables as well as
 // the variables inherited by the superclass
    public SalariedEmployee(double yearlySalary, double stipends, String 
            empFirstName, String empLastName, String empBirthdate, String 
                    empAddress, String empCity, String empState, String 
                            empEmail, String empPhone, String empDept, int 
                                    empIDNumber, int empZip) 
    {
        super(empFirstName, empLastName, empBirthdate, empAddress, 
                empCity, empState, empEmail, empPhone, empDept, empIDNumber, 
                empZip);
        this.yearlySalary = yearlySalary;
        this.stipends = stipends;
    }
    
    // Methods for setting and getting yearlySalary and stipends
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getStipends() {
        return stipends;
    }

    public void setStipends(double stipends) {
        this.stipends = stipends;
    }
    
 
 
    }
