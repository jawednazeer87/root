package org.la.core.java.student.wang.assignment9.EmployeeTask;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.child();
        driver.name();

        Employee employee = new Developer();
        employee.child();
        employee.name();

        Tester tester = new Tester();
        tester.child();
        tester.name();

    }
}
