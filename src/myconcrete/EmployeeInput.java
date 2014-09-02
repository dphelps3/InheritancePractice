
package myconcrete;

import java.util.Scanner;

public class EmployeeInput {
    
    public static void main(String[] args) {
        
    
    // Public variables that will link with the private variables of
    // the Employee class
        
    String employeeFirstName,
                    employeeLastName,
                    employeeBirthdate,
                    employeeAddress,
                    employeeCity,
                    employeeState,
                    employeeEmail, // Holds personal employee info
                    employeePhone,            
                    employeeDept; // Holds employee company info
    
    int employeeIDNumber,
                employeeZip;
                 // Holds numeric employee info
    
    // Create a scanner for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Create an Employee object
    Employee e = new Employee();
    
    // Get the user's company ID number
    System.out.println("Enter your company ID number: ");
    employeeIDNumber = keyboard.nextInt();
    keyboard.nextLine();

    // Get the user's first name
    System.out.println("Enter your first name: ");
    employeeFirstName = keyboard.nextLine();
    
    // Get the user's last name
    System.out.println("Enter your last name: ");
    employeeLastName = keyboard.nextLine();
    
    // Get the user's birthdate
    System.out.println("Enter your birthdate: ");
    employeeBirthdate = keyboard.nextLine();
    
    // Get the user's street address
    System.out.println("Enter your street address: ");
    employeeAddress = keyboard.nextLine();
    
    // Get the user's city
    System.out.println("Enter your city: ");
    employeeCity = keyboard.nextLine();
    
    // Get the user's state
    System.out.println("Enter your state: ");
    employeeState = keyboard.nextLine();
    
    // Get the user's zip code
    System.out.println("Enter your zip code: ");
    employeeZip = keyboard.nextInt();
    keyboard.nextLine();    
    
    // Get the user's phone number
    System.out.println("Enter your phone number: ");
    employeePhone = keyboard.nextLine();
    
    // Get the user's email address
    System.out.println("Enter your email address: ");
    employeeEmail = keyboard.nextLine();
    
    // Get the user's department
   System.out.println("Enter your department: ");
    employeeDept = keyboard.nextLine();
    
    
    // Output information, getting the moet1232121hods from the Employee class
    System.out.println("\n\nDP PRODUCTIONS EMPLOYEE INFORMATION"
    + "\nID Number: " + e.getEmpIDNumber() +
    "\nDepartment: " + e.getEmpDept() +
    "\nBirthdate: " + e.getEmpBirthdate() +
    "\nName: " + e.getEmpFirstName() + " " + e.getEmpLastName() +
    "\nAddress: " + e.getEmpAddress() +
    "\n" + (e.getEmpCity() + ", " + e.getEmpState() + " " + e.getEmpZip() +
    "\nPhone Number: " + e.getEmpPhone() +
    "\nEmail Address: " + e.getEmpEmail()));
    
    
    }
}

