package org.la.core.java.student.wang.assignment10.Task05;

public class Tester extends Employee{
    @Override
    protected void name() {
        System.out.println("Tester here");
    }

    @Override
    void child() {
        System.out.println("This Tester do not have child");
    }
}
