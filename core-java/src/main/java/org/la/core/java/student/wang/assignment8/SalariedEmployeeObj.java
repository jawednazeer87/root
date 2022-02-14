package org.la.core.java.student.wang.assignment8;

public class SalariedEmployeeObj {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.setId(1);
        salariedEmployee.setAnnualSalary(40000);
        salariedEmployee.setEmployeeId(1);

        System.out.println("salariedEmployee.getId() = " + salariedEmployee.getId());
        System.out.println("salariedEmployee.getAnnualSalary() = " + salariedEmployee.getAnnualSalary());
        System.out.println("salariedEmployee.getEmployeeId() = " + salariedEmployee.getEmployeeId());
    }


}
