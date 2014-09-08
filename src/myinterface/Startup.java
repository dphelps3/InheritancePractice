package myinterface;

import java.util.Scanner;

public class Startup {
    
    public static void main(String[] args) {
    
    SalariedEmployee salariedEmp1 = new SalariedEmployee();
    
    salariedEmp1.getYearlySalary();
    salariedEmp1.getStipends();
    
    System.out.println("The employee pay is: $" 
            + salariedEmp1.getYearlySalary());
    
    }
}
