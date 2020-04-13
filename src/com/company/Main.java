package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, Map<String, Object>>> employees = new HashMap<String, Map<String, Map<String, Object>>>();
/*        String employeeName = inputString("What is the employee's name?");
        double hoursWorked = inputDouble("How many hours has the employee worked?");
        double additions = inputDouble("Does the employee have any additions to add?");
        double allowances = inputDouble("Does the employee have any allowances to add?");

        Manager kristyn = new Manager(employeeName);
        System.out.println(kristyn.name + ":");
        System.out.println(kristyn.calcPay());*/
        entryQuestion();
    }
    public static void entryQuestion() {
        while (true) {
            int userInput = inputInt("Welcome to the payroll app are you an employee[1] or a manager[2]?");
            if (userInput == 1) {
                employeeWorkflow();
                break;
            } else if (userInput == 2) {
                managerWorkflow();
                break;
            }
            System.out.println("Invalid response. Please try again.");
        }

    }

    private static void managerWorkflow() {
        String name = inputString("What is the new employee's name");
        System.out.println("I actually don't care.");
    }
    private static void employeeWorkflow() {
        System.out.println("I don't work for you.");
    }
    private static String inputString(String displayString) {
        System.out.println(displayString);
        Scanner input = new Scanner(System.in);
        String outString = input.nextLine();
        return outString;
    }
    private static double inputDouble(String displayString) {
        System.out.println(displayString);
        Scanner input = new Scanner(System.in);
        double outDouble = input.nextDouble();
        return outDouble;
    }
    private static int inputInt(String displayString) {
        System.out.println(displayString);
        Scanner input = new Scanner(System.in);
        int outInt = input.nextInt();
        return outInt;
    }
}
