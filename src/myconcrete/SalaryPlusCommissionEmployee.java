
package myconcrete;

public class SalaryPlusCommissionEmployee extends Employee {
    
// variables needed exclusively for hourly employees
 private double spcSalary;
 private double spcStipends = spcSalary / 24; // Yearly salary divided
                        // by 24 ( Employee is paid twice a month)
 private double spcCommission; // Commission rate for spc employees

 // Constructor created for new exclusive variables as well as
 // the variables inherited by the superclass

    public SalaryPlusCommissionEmployee() {
    }

    public SalaryPlusCommissionEmployee(String name, String dept, int empID) {
        super(name, dept, empID);
    }
    
    @Override
    public void employeeType() {
        System.out.println("Salary plus Commission Employee");
    }
    
    // Methods 
    public double getSpcSalary() {
        return spcSalary;
    }

    public void setSpcSalary(double spcSalary) {
        this.spcSalary = spcSalary;
    }

    public double getSpcStipends() {
        return spcStipends;
    }
    
    public double getSpcCommission() {
        return spcCommission;
    }

    public void setSpcCommission(double spcCommission) {
        this.spcCommission = spcCommission;
    }
   
 
 
    }