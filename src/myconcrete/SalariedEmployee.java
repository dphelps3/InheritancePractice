
package myconcrete;

public class SalariedEmployee extends Employee {
    
// variables needed exclusively for hourly employees
 private double yearlySalary;
 private double stipends = yearlySalary / 24; // Yearly salary divided
                        // by 24 ( Employee is paid twice a month)

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String dept, int empID) {
        super(name, dept, empID);
    }
    
    @Override
    public void employeeType() {
        System.out.println("Salaried Employee");
    }
    
    // Methods for setting and getting hoursWorked and payRate
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getStipends() {
        return stipends;
    }
   
 
 
    }