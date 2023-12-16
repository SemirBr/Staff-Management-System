package com.startup.aplication;

import com.manager.StaffManager;
import com.service.SearchService;
import com.service.StaffService;

import java.util.Scanner;

public class StaffManagementApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StaffService service = new StaffService();
        SearchService searchService = new SearchService();
        StaffManager manager = new StaffManager(service, searchService);

        System.out.println("Welcome to Staff Management System");
        displayCommands();

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            manager.execute(command);
        }
    }

    private static void displayCommands() {
        System.out.println("Available commands: add, edit, fire, list, search, save and exit");
    }
}
