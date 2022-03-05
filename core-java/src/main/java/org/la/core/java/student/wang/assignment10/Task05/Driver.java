package org.la.core.java.student.wang.assignment10.Task05;

public class Driver extends Employee{
    @Override
    protected void name() {
        System.out.println("Driver is here");
    }

    @Override
    void child() {
        System.out.println("Driver do not have child");
    }
}
