
package myabstract;

public class HourlyEmployee extends Employee {
    
    private double hoursWorked;
    private double payRate;
    
    public HourlyEmployee(String empFirstName, String empLastName, String 
            empBirthdate, String empAddress, String empCity, String 
                    empState, String empEmail, String empPhone, String 
                            empDept, int empIDNumber, int empZip)
    {
        super(empFirstName, empLastName, empBirthdate, empAddress, empCity, 
                empState, empEmail, empPhone, empDept, empIDNumber, empZip);
    }
    
    // Methods used to make hoursWorked and payRate public
    public void setHoursWorked(double empHoursWorked)
    {
        hoursWorked = empHoursWorked;
    }
    
    public void setPayRate(double empPayRate)
    {
        payRate = empPayRate;
    }
    
    public String toString()
    {
        String str;
        str = super.toString() +
                "\nHours Worked: " + hoursWorked +
                "\nPay Rate: " + payRate;
        
    // Return the string
    return str;
    }

    @Override
    public int getEmployeeDuration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
