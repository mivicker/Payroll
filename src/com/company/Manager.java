package com.company;

public class Manager extends Employee {
    double allowances;

    public Manager(String name) {
        super(name);
        hourlyRate = 50;
        allowances = 100;
    }

    @Override
    public double calcPay() {
        return super.calcPay() + allowances;
    }
}
