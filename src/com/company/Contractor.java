package com.company;

import static java.lang.StrictMath.max;
import static java.lang.StrictMath.min;

public class Contractor extends Employee {
    double additions;
    double overtime;
    double overtimeRate;

    public Contractor(String name) {
        super(name);
        hourlyRate = 30;
        overtimeRate = hourlyRate * 1.5;
    }

    @Override
    public void addHours(double hours) {
        hoursWorked += hours;
        hoursWorked = min(hoursWorked, 40);
        overtime += max(hoursWorked, 40) - 40;
    }

    @Override
    public double calcPay() {
        return (super.calcPay() + additions + (overtime * overtimeRate));
    }
}
