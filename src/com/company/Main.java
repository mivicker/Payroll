package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee kristyn = new Employee(100, 32, "Kristyn");
        System.out.println(kristyn.CalcPay());
    }
}
