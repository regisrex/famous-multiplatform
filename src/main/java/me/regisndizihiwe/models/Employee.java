package me.regisndizihiwe.models;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String gender;
    private int salary;

    public Employee(int id, String name, String email, int salary, String gender) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(String name, String email, int salary, String gender) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{ " +
                "\n  id=" + id +
                "\n, name='" + name + '\'' +
                "\n, email='" + email + '\'' +
                "\n, gender='" + gender + '\'' +
                "\n, salary=" + salary +
                "\n}";


    }
}
