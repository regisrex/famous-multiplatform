package me.regisndizihiwe;

import me.regisndizihiwe.jdbc.Repository;
import me.regisndizihiwe.models.Employee;
import me.regisndizihiwe.prompt.EmployeePrompt;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("------------- EMPLOYEE MANAGEMENT SYSTEM --------------");

            Repository repository = new Repository();
            System.out.println("$ Connecting to database......");

            repository.connectDatabase();
            System.out.println("$  ✅ Database connected");

            System.out.println("$ Creating non existing tables......");

            repository.createTables();
            System.out.println("$  ✅ Tables created");

            Employee employee = EmployeePrompt.getEmployeeData();
            System.out.println(employee.toString());

            boolean isAdded =  repository.addEmployee(employee);
            if(!isAdded) System.out.println("Employee added to database");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}