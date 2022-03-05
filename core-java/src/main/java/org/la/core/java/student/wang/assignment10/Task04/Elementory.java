package org.la.core.java.student.wang.assignment10.Task04;

public class Elementory extends School{
    @Override
    void numStudents(int numStudents) {
        System.out.println("Elementory has "+ numStudents+" students");
    }

    @Override
    String address() {
        return "300 N Main Ave, Alhambra";
    }

    @Override
    void name(String name) {
        System.out.println("School's name is "+ name);
    }
}
