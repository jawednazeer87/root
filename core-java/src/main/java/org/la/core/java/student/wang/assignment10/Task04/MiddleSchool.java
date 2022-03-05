package org.la.core.java.student.wang.assignment10.Task04;

public class MiddleSchool extends School{
    @Override
    void numStudents(int numStudents) {
        System.out.println("Middle School has "+ numStudents+" students");
    }

    @Override
    String address() {
        return "100 S Altantic Ave, Alhambra";
    }

    @Override
    void name(String name) {
        System.out.println("Middle School's name is "+name);
    }
}
