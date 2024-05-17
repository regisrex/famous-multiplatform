package me.regisndizihiwe.jdbc;

import me.regisndizihiwe.models.Employee;

import java.sql.*;

public class Repository {
    private Connection connection;

    private Statement getStatement() throws SQLException {
        return this.connection.createStatement();
    }

    public void connectDatabase() throws
            ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcplayground", "root", "");

    }

    public void createTables() throws Exception {
        Statement statement = this.getStatement();
        boolean createUsers = statement.execute("CREATE TABLE IF NOT EXISTS employees(id int auto_increment primary key,name varchar(200)  not null  , email varchar(30) not null, gender varchar(10) not null, salary int not null )");
        if (createUsers) {
            System.out.println("Employee table created");
        }
    }

    public boolean addEmployee(Employee employee) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("INSERT  into employees(name, email, gender, salary) VALUES(? ,?  ,?, ?)");
        statement.setString(1, employee.getName());
        statement.setString(2, employee.getEmail());
        statement.setString(3, employee.getGender());
        statement.setInt(4, employee.getSalary());
     int res =    statement.executeUpdate();
       if(res == 1){
           return true;
       }
       return false;
    }

}
