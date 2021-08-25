package com.training.org;

public class Customer {
    private int custId;
    private String custName;
    private String custAddress;

    public Customer() {
        System.out.println("Default constructor of Cust is called");
        custId = 0;
        custName = "";
        custAddress = "";
    }

    public Customer(int custId, String custName, String custAddress) {
        System.out.println("Parameterised constructor of Employee is called");
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    public void showCustomerDetails() {
        System.out.println("customer details are" + custId + " Name :- " + custName + " address :- " + custAddress);
    }
}

