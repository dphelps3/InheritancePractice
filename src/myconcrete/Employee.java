
package myconcrete;

// A class that holds Employee properties and methods

public class Employee {
    
    // Common properties to all subclasses
    private String name;
    private String dept;
    private int empID; // Employee ID can be up to 3 digits (up to 999)

    // Two constructors, for convenience...
    
    public Employee() {
    }

    public Employee(String name, String dept, int empID) {
        this.name = name;
        this.dept = dept;
        this.empID = empID;
    }
    
    public void employeeType() {
        System.out.println("Regular Employee");
    }

    // Just some necessary accessors and mutators for our properties...
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        if(empID < 0 || empID > 1000) {
            throw new IllegalArgumentException();
        }
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
        // validation needed for name
        this.dept = dept;
    }
    
    
}
