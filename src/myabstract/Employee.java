
package myabstract;

public abstract class Employee {
    // Common properties to all subclasses
    private int empID;
    private String name;
    private String dept;

    // Two constructors, for convenience...
    
    public Employee() {
    }

    public Employee(int empID, String name, String dept) {
        this.empID = empID;
        this.name = name;
        this.dept = dept;
    }
    
    public abstract void displayEmployeeType();

    // Just some necessary accessors and mutators for our properties...
    
    public int getEmpID() {
        return empID;
    }
    

    public void setEmpID(int empID) {
         
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // validation needed for name
        this.name = name;
    }
    
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        // validation needed for dept
        this.dept = dept;
    }
    
}