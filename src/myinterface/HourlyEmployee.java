
package myinterface;

public class HourlyEmployee implements Employee {
    
    private int empID;
    private String name;
    private String dept;
    
    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String name, String dept) {
        this.dept = dept;
        this.name = name;
        this.empID = empID;
    }
    
    // We cannot forget to override these. Inheriting from an Interface is a
    // contractual obligation that forces us
    // to do this. Try commenting out any of these methods and see how you get an
    // error.
    @Override
    public void displayEmployeeType() {
        System.out.println("Meow");
    }

    @Override
    public int getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}