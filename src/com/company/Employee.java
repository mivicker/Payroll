package com.company;

public class Employee {
    double hourlyRate;
    double hoursWorked;
    String name;
    double basePay;
    double totalPay;

    public Employee(double hourlyRate, double hoursWorked, String name) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.basePay = 100000;
    }
    public double CalcPay() {
        return this.hoursWorked * this.hourlyRate;
    }
}
