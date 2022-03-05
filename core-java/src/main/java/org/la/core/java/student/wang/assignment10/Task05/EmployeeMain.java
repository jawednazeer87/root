package org.la.core.java.student.wang.assignment10.Task05;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Developer();
        employee.name();
        employee.child();

        employee = new Tester();
        employee.name();
        employee.child();

        employee = new Driver();
        employee.name();
        employee.child();
    }
}
