
package myconcrete;

import javax.swing.JOptionPane;

public class EmployeeInput {
    
    public static void main(String[] args) {
        
    
    // Public variables that will link with the private variables of
    // the Employee class
    
    String employeeInput; // For user input
    
    String employeeFirstName,
                    employeeLastName,
                    employeeBirthdate,
                    employeeAddress,
                    employeeCity,
                    employeeState,
                    employeeEmail, // Holds personal employee info
    
                    employeeDept; // Holds employee company info
    
    int employeeIDNumber,
                employeeZip,
                employeePhone; // Holds numeric employee info
    
    // Create an Employee object
    Employee e = new Employee();
    
    // Get the user's company ID number
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your company ID number: ");
    employeeIDNumber = Integer.parseInt(employeeInput);

    // Get the user's first name
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your first name: ");
    employeeFirstName = employeeInput;
    
    // Get the user's last name
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your last name: ");
    employeeLastName = employeeInput;
    
    // Get the user's birthdate
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your birthdate: ");
    employeeBirthdate = employeeInput;
    
    // Get the user's street address
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your street address: ");
    employeeAddress = employeeInput;
    
    // Get the user's city
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your city: ");
    employeeCity = employeeInput;
    
    // Get the user's state
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your state: ");
    employeeState = employeeInput;
    
    // Get the user's zip code
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your zip code: ");
    employeeZip = Integer.parseInt(employeeInput);
    
    // Get the user's phone number
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your phone number: ");
    employeePhone = Integer.parseInt(employeeInput);
    
    // Get the user's email address
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your email address: ");
    employeeEmail = employeeInput;
    
    // Get the user's department
    employeeInput = JOptionPane.showInputDialog(null, 
            "Enter your department: ");
    employeeDept = employeeInput;
    
    
    // Output information, getting the moethods from the Employee class
    System.out.print("Name: " + e.getEmpFirstName() + "" + e.getEmpLastName());
    
    
    
    }
}

