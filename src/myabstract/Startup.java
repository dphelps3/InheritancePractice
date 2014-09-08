package myabstract;

import java.util.Scanner;

public class Startup {
    
    public static void main(String[] args) {
        
    double hoursWorked = 50;
    double payRate = 21.50;
    
    HourlyEmployee hourlyEmp1 = new HourlyEmployee();
    hourlyEmp1.setHoursWorked(hoursWorked);
    hourlyEmp1.setPayRate(payRate);
    
    System.out.println("The employee pay is: $" 
            + hourlyEmp1.displayHourlyEmployeePay());
    
    }
}
