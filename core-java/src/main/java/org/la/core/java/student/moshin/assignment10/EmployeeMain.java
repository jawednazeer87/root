package org.la.core.java.student.moshin.assignment10;

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
