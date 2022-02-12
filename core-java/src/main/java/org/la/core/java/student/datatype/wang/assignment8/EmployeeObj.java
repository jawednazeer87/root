package org.la.core.java.student.datatype.wang.assignment8;

import java.time.LocalDate;

public class EmployeeObj {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmployeeName("Wong");
        employee.setEmployeeNum(1);
        employee.setDateHired(LocalDate.of(2022,1,1));
        employee.setCityId(1);

        System.out.println("employee.getId() = " + employee.getId());
        System.out.println("employee.getEmployeeName() = " + employee.getEmployeeName());
        System.out.println("employee.getEmployeeNum() = " + employee.getEmployeeNum());
        System.out.println("employee.getDateHired() = " + employee.getDateHired());
        System.out.println("employee.getCityId() = " + employee.getCityId());
    }
}
