package org.la.core.java.student.wang.assignment9.EmployeeTask;

public class Developer extends Employee{
    @Override
    protected void name() {
        System.out.println("Developer's name is Wang");
    }

    @Override
    void child() {
        System.out.println("Developer did not have child");
    }
}
