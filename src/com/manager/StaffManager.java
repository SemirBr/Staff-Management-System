package com.manager;

import com.classes.Employee;
import com.service.SearchService;
import com.service.StaffService;

import java.util.ArrayList;
import java.util.List;

import static com.startup.aplication.StaffManagementApp.scanner;

public class StaffManager {
    private final StaffService staffService;
    private final SearchService searchService;

    public StaffManager(StaffService staffService, SearchService searchService) {
        this.staffService = staffService;
        this.searchService = searchService;
    }

    //Initialize menu
    public void execute(String command) {

        switch (command) {
            case "add":
                staffService.addEmployee();
                break;
            case "edit":
                System.out.println("Insert ID you want to edit: ");
                int employeeID = Integer.parseInt(scanner.nextLine());
                staffService.editEmployee(employeeID);
                break;
            case "fire":
                System.out.println("Insert ID you want to fire: ");
                int employeeIDToFire = Integer.parseInt(scanner.nextLine());
                staffService.fireEmployee(employeeIDToFire);
                break;
            case "list":
                ArrayList<Employee> employeeList = staffService.listEmployee();
                for (Employee employee : employeeList) {
                    System.out.println(employee.toString());
                }
                break;
            case "search":
                System.out.println("Enter the criteria you want to search by:");
                String criteria = scanner.nextLine();
                List<Employee> employees;
                switch (criteria) {
                    case "ID":
                        System.out.println("Enter ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        employees = searchService.findById(id);
                        for (Employee employee : employees) {
                            System.out.println(employee.toString());
                        }
                        break;
                    case "name":
                        System.out.println("Enter name: ");
                        String name = scanner.nextLine();
                        employees = searchService.findByName(name);
                        for (Employee employee : employees) {
                            System.out.println(employee.toString());
                        }
                        break;
                    case "department":
                        System.out.println("Enter department: ");
                        String department = scanner.nextLine();
                        employees = searchService.findByDepartment(department);
                        for (Employee employee : employees) {
                            System.out.println(employee.toString());
                        }

                        break;
                    case "role":
                        System.out.println("Enter role: ");
                        String role = scanner.nextLine();
                        employees = searchService.findByRole(role);
                        for (Employee employee : employees) {
                            System.out.println(employee.toString());
                        }
                        break;
                    default:
                        System.out.println("Invalid command. Please try again.");
                        break;
                }
                break;
            case "save and exit":
                System.out.println("Saving data and exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid command. Please try again.");
                break;
        }
    }

}
