package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        employee[] employees = new employee[10];

        for (int i = 0; i < 10; i++) {
            employees[i] = new employee("Employee " + (i + 1), "emp" + i + "@company.com", 25 + i, 15000.0 + (i * 1000));
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))) {
            for (employee emp : employees) {
                writer.println(emp.toString());
            }
            System.out.println("Succesful");
        } catch (IOException e) {
            System.out.printf("Xəta: " + e.getMessage());
        }
    }
}