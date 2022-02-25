package org.la.core.java.student.wang.assignment9.EmployeeTask;

public class Tester extends Employee{
    @Override
    protected void name() {
        System.out.println("Tester's name is Ma");
    }

    @Override
    void child() {
        System.out.println("Tester do not have child");
    }
}
