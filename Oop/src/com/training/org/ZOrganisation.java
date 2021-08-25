package com.training.org;

public class ZOrganisation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.showEmployeeDetails();
        //Employee e2 = new Employee( empId:101, name:"vijay", salary:30000);
        //e2.showEmployeeDetails();
            /*Customer c1 = new Customer();
            c1.showCustomerDetails();
             */
        Customer c2 = new Customer(11, "aryha", "mumbai");
        c2.showCustomerDetails();
        Bank b2 = new Bank("ICICI", "2384", "savings", 2500000);
        b2.showBankDeatils();
        Employee e2 = new Employee(101, "vijay", 10000);
        e2.showEmployeeDetails();

        Employee e3 = new Employee();
        e3.acceptEmployeeDetails();
        e3.showEmployeeDetails();

        if (e2.getSalary() < 40000)
            e2.setSalary(e2.getSalary() + (e2.getSalary() * 5) / 100);
        else if (e2.getSalary() >= 40000 && e2.getSalary() < 50000)
            e2.setSalary(e2.getSalary() + (e2.getSalary() * 7) / 100);
        else if (e2.getSalary() >= 50000 && e2.getSalary() < 70000)
            e2.setSalary(e2.getSalary() + (e2.getSalary() * 10) / 100);
        else if (e2.getSalary() > 70000)
            e2.setSalary(e2.getSalary() + (e2.getSalary() * 15) / 100);


    }


}



