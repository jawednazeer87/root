package org.la.core.java.student.wang.assignment9.EmployeeTask;

public class Driver extends Employee{
    @Override
    protected void name() {
        System.out.println("Driver's name is Ibrahim");
    }

    @Override
    void child() {
        System.out.println("Driver do not have child");
    }
}
