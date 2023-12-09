package com.service;

import com.classes.Employee;

import java.text.ParseException;
import java.util.ArrayList;

public interface IStaffService {
    //List all the employees
    ArrayList<Employee> listEmployee();
    //Insert new employee to the database
    void addEmployee() throws ParseException;
    //Edit employee
    void editEmployee(int employeeID) throws ParseException;
    //Delete employee
    void fireEmployee(int employeeID);

}
