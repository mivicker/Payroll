package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Filereaderwriter readerWriter = new Filereaderwriter("src/payrollDB.txt");
         while (true) {
            int userInput = inputInt("Welcome to the payroll app are you an employee[1] or a manager[2]?");
            if (userInput == 1) {
                employeeWorkflow(readerWriter);
                break;
            } else if (userInput == 2) {
                managerWorkflow(readerWriter);
                break;
            }
            System.out.println("Invalid response. Please try again.");
        }
    }

    private static void managerWorkflow(Filereaderwriter readerWriter) {
        while (true) {
            int userInput = inputInt("[1] to view employees and hours worked [2] to add a new employee [3] to exit.");
            if (userInput == 1) {
                readerWriter.readAllFromPayroll();
                userInput = inputInt("[1] to do something else [2] to quit");
                if (userInput == 1) {
                    continue;
                } else {
                    System.out.println("Thank you for using the payroll program.");
                    break;
                }
            } else if (userInput == 2) {
                break;
            } else if (userInput ==3) {
                System.out.println("Thank you for using the payroll program.");
                break;
            }
            System.out.println("Invalid response. Please try again.");
        }
        int userInput = inputInt("[1] to view employees and hours worked [2] to add a new employee [3] to exit.");
    }
    private static void employeeWorkflow(Filereaderwriter readerWriter) {
        while(true){
        int userInput = inputInt("[1] to view hours [2] to add hours [3] exit.");
            if (userInput == 1) {
                break;
            } else if (userInput == 2) {
                break;
            } else if (userInput ==3) {
                System.out.println("Thank you for using the payroll program.");
                break;
            }
            System.out.println("Invalid response. Please try again.");
        }
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
