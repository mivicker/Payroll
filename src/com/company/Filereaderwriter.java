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
    public void readFromPayroll() {
        try {
            Scanner scan = new Scanner(payrollDB);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("You probably spelled the filename wrong ... try again.");
        }
    }
    public void writeToPayroll(String name, int hours) {
        try {
            FileWriter writer = new FileWriter(payrollDB);
            writer.write(name + "|" + hours);
            writer.close();
            System.out.println("Logged that " + name + " worked " + hours + " hours.");
        } catch (Exception e) {
            System.out.println("An error occured ... please try again.");
        }
    }
}