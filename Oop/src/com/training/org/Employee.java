package com.training.org;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee() {
        System.out.println("Default constructor of Employee is called");
        empId = 0;
        name = "";
        salary = 0;
    }

    public Employee(int empId, String name, double salary) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee details are Id:" + empId + " Name :- " + name + " Salary :- " + salary);
    }

    public void acceptEmployeeDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter empId");
        empId = Integer.parseInt(input.nextLine());

        System.out.println("Enter name");
        name = input.nextLine();

        System.out.println("Enter salary");
        salary = input.nextDouble();
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double i) {
        return salary;
    }
}




