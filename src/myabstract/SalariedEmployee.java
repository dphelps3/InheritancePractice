
package myabstract;

public class SalariedEmployee extends Employee {
    
    // private variables
    private double yearlySalary;
    private double stipends = yearlySalary / 24;
    
    
    public SalariedEmployee() {
    }

    public SalariedEmployee(int empID, String name, String dept) {
        super(empID, name, dept);
    }
    
    // We cannot forget to do this. Inheriting an abstract method forces us
    // to do this. Try commenting this method out and see how you get an
    // error.
    @Override
    public void displayEmployeeType() {
        System.out.println("Salaried Employee");
    }


}