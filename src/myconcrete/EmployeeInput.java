
package myconcrete;

import javax.swing.JOptionPane;

public class EmployeeInput {
    
    // Public variables that will link with the private variables of
    // the Employee class
    
    String employeeInput; // For user input
    
    public String employeeFirstName,
                    employeeLastName,
                    employeeBirthdate,
                    employeeAddress,
                    employeeCity,
                    employeeState,
                    employeeEmail, // Holds personal employee info
    
                    employeeDept; // Holds employee company info
    
    public int employeeIDnumber,
                employeeZip,
                employeePhone; // Holds numeric employee info
    
    // Get the user's first name
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your first name: ");
    employeeFirstName = employeeInput;
    
}
