package com.company;

import java.util.Map;

public class Employee {
    double hourlyRate;
    double hoursWorked;
    String name;

    public Employee(String name) {
        this.hourlyRate = 20.75;
        this.name = name;
    }

    public void addToMap(Map<String, Double> empMap) {
        empMap.put(name, hoursWorked);
    }

    public void updateMap(Map<String, Double> empMap) {
        empMap.replace(name, hoursWorked);
    }

    public void addHours(double hours) {
        hoursWorked += hours;
    }

    public double calcPay() {
        return this.hoursWorked * this.hourlyRate;
    }
}
