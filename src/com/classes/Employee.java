package com.classes;

import java.util.Date;

public class Employee extends User {
    private String department;
    private String role;
    private double salary;
    private Date startDate;
    private Date endDate;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Employee(int ID, String name, String department, String role, double salary, Date startDate, Date endDate) {
        super(ID, name);
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //default constructor
    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
