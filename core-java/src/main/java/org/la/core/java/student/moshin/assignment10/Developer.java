package org.la.core.java.student.moshin.assignment10;

public class Developer extends Employee{
    @Override
    protected void name() {
        System.out.println("Developer is here");
    }

    @Override
    void child() {
        System.out.println("Developer has one child");
    }
}
