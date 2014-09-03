
package myabstract;

public class HourlyEmployee extends Employee {
    
    // private variables
    private int empID;
    private String name;
    private String dept;
    
    
    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String name, String dept) {
        super(empID, name, dept);
    }
    
    // We cannot forget to do this. Inheriting an abstract method forces us
    // to do this. Try commenting this method out and see how you get an
    // error.
    @Override
    public void displayEmployeeType() {
        System.out.println("Hourly Employee");
    }


}