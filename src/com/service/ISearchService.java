package com.service;

import com.classes.Employee;
import java.util.List;

public interface ISearchService {
    //Finds employees by their name.
    List<Employee> findByName(String name);
    //Finds employees by their department.
    List<Employee> findByDepartment(String department);
    //Finds employees by their ID.
    List<Employee> findById(int id);
    //Finds employees by their role.
    List<Employee> findByRole(String role);

}
