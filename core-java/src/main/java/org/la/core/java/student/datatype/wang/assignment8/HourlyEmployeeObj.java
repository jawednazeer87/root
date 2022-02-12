package org.la.core.java.student.datatype.wang.assignment8;

public class HourlyEmployeeObj {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setId(1);
        hourlyEmployee.setAnnualSalary(40000);
        hourlyEmployee.setEmployeeId(1);

        System.out.println("hourlyEmployee.getId() = " + hourlyEmployee.getId());
        System.out.println("hourlyEmployee.getAnnualSalary() = " + hourlyEmployee.getAnnualSalary());
        System.out.println("hourlyEmployee.getEmployeeId() = " + hourlyEmployee.getEmployeeId());
    }
}
