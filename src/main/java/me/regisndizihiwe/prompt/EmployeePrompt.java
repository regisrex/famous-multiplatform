package me.regisndizihiwe.prompt;

import me.regisndizihiwe.models.Employee;

import java.util.Scanner;

public class EmployeePrompt {
   public  static Employee   getEmployeeData(){
       Scanner scanner  = new Scanner(System.in);
       Employee newEmp = new Employee();
       System.out.print("Enter employee name:");
       newEmp.setName(scanner.nextLine());
       System.out.println();
       System.out.print("Enter employee gender:");
       newEmp.setGender(scanner.nextLine());
       System.out.println();
       System.out.print("Enter employee salary:");
       newEmp.setSalary(Integer.parseInt(scanner.nextLine()));
       System.out.println();
       System.out.print("Enter employee email:");
       newEmp.setEmail(scanner.nextLine());
       return newEmp;
    }
}
