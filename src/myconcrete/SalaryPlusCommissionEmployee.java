
package myconcrete;

public class SalaryPlusCommissionEmployee extends Employee {
    
// variables needed exclusively for hourly employees
 private double spcSalary;
 private double spcStipends = spcSalary / 24; // Yearly salary divided
                        // by 24 ( Employee is paid twice a month)
 private double spcCommission; // Commission rate for spc employees

 // Constructor created for new exclusive variables as well as
 // the variables inherited by the superclass
    public SalaryPlusCommissionEmployee(double spcSalary, double spcStipends, 
            double spcCommission, String empFirstName, String empLastName, 
            String empBirthdate, String empAddress, String empCity, String 
                    empState, String empEmail, String empPhone, String empDept, 
                    int empIDNumber, int empZip) 
    {
        super(empFirstName, empLastName, empBirthdate, empAddress, 
                empCity, empState, empEmail, empPhone, empDept, empIDNumber, 
                empZip);
        this.spcSalary = spcSalary;
        this.spcStipends = spcStipends;
        this.spcCommission = spcCommission;
    }

    // Methods for setting and getting spcSalary, spcStipends, and spcCommission
    public double getSpcSalary() {
        return spcSalary;
    }

    public void setSpcSalary(double spcSalary) {
        this.spcSalary = spcSalary;
    }

    public double getSpcStipends() {
        return spcStipends;
    }

    public void setSpcStipends(double spcStipends) {
        this.spcStipends = spcStipends;
    }

    public double getSpcCommission() {
        return spcCommission;
    }

    public void setSpcCommission(double spcCommission) {
        this.spcCommission = spcCommission;
    }
    
 
    
 
 
    }
