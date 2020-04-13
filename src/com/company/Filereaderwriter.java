package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Filereaderwriter {
    File payrollDB;

    public Filereaderwriter(String path) {
        payrollDB = new File(path);
    }

    public void readAllFromPayroll() {
        try {
            Scanner scan = new Scanner(payrollDB);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("You probably spelled the filename wrong ... try again.");
        }
    }

    public String spitOutEmployeeString(String employeeName) {
        try {
            Scanner scan = new Scanner(payrollDB);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] entryParts = line.split(" ");
                if (entryParts[0].equalsIgnoreCase(employeeName)) {
                    return line;
                } else {
                    System.out.println("Employee not found.");
                    return "nothing here...";
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("You probably spelled the filename wrong ... try again.");
            return "nothing here...";
        }
        return "an error occurred";
    }
    public void writeToPayroll(String name, int hours) {
        try {
            FileWriter writer = new FileWriter(payrollDB);
            writer.write(name + "|" + hours);
            writer.close();
            System.out.println("Logged that " + name + " worked " + hours + " hours.");
        } catch (Exception e) {
            System.out.println("An error occurred ... please try again.");
        }
    }
    public Employee createEmployeeFromFile(String name) {
        String[] employeeUnpacked = name.split(" | ");
        Employee freshEmployee = new Employee(employeeUnpacked[0]);
        freshEmployee.addHours(Double.parseDouble(employeeUnpacked[1]));
        return freshEmployee;
    }
}