package org.la.core.java.student.datatype.wang.assignment8;

public class SalariedEmployee {
    /*
    7.	Create a class SalariedEmployee having member variables id, annualSalary, employeeId. create getters and setters for all member variables. Create object of SalariedEmployee class in other class inside main method and set all member values and print all member values using getters.
     */
    private int id, annualSalary, employeeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
