
package myconcrete;

// A class that holds Employee properties and methods

public class Employee {
    
    // Declared local variables
    
    private String empFirstName, 
                    empLastName,
                    empBirthdate,
                    empAddress,
                    empCity,
                    empState,
                    empEmail, // Holds personal employee info
    
                    empDept; // Holds employee company info
    
    private int empIDnumber,
                empZip,
                empPhone; // Holds numeric employee info
    
    // Methods that will store the local variables as public arguments
    
    
    public String getEmpFirstName() {
        return empFirstName;
    }

    // Links private string empFirstName to public variable employeeFirstName
    public void setEmpFirstName(String empFirstName) {
        
        empFirstName = employeeFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpBirthdate() {
        return empBirthdate;
    }

    public void setEmpBirthdate(String empBirthdate) {
        this.empBirthdate = empBirthdate;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public int getEmpIDnumber() {
        return empIDnumber;
    }

    public void setEmpIDnumber(int empIDnumber) {
        this.empIDnumber = empIDnumber;
    }

    public int getEmpZip() {
        return empZip;
    }

    public void setEmpZip(int empZip) {
        this.empZip = empZip;
    }

    public int getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(int empPhone) {
        this.empPhone = empPhone;
    }
    
    
}
