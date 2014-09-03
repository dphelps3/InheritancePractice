
package myabstract;

public abstract class Employee {
    
     // Declared local variables
    private String empFirstName, 
                    empLastName,
                    empBirthdate,
                    empAddress,
                    empCity,
                    empState,
                    empEmail, // Holds personal employee info
                    empPhone,
                    empDept; // Holds employee company info
    
    private int empIDNumber,
                empZip; // Holds numeric employee info

    public Employee(String empFirstName, String empLastName, String 
            empBirthdate, String empAddress, String empCity, String 
                    empState, String empEmail, String empPhone, String 
                            empDept, int empIDNumber, int empZip) 
    {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empBirthdate = empBirthdate;
        this.empAddress = empAddress;
        this.empCity = empCity;
        this.empState = empState;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empDept = empDept;
        this.empIDNumber = empIDNumber;
        this.empZip = empZip;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
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

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public int getEmpIDNumber() {
        return empIDNumber;
    }

    public void setEmpIDNumber(int empIDNumber) {
        this.empIDNumber = empIDNumber;
    }

    public int getEmpZip() {
        return empZip;
    }

    public void setEmpZip(int empZip) {
        this.empZip = empZip;
    }
    
    // Abstract method for finding how many years an employee
    // worked for this company
    public abstract int getEmployeeDuration();
    
    
    
}
