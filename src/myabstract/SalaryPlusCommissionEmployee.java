
package myabstract;

public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    // private variables
    private int spcSalary;
    private String spcStipends;
    private String spcCommission;
    
    
    public SalaryPlusCommissionEmployee() {
    }

    public SalaryPlusCommissionEmployee(int empID, String name, String dept) {
        super(empID, name, dept);
    }
    
    // We cannot forget to do this. Inheriting an abstract method forces us
    // to do this. Try commenting this method out and see how you get an
    // error.
    @Override
    public void displayEmployeeType() {
        System.out.println("Salaried plus Commission Employee");
    }


}