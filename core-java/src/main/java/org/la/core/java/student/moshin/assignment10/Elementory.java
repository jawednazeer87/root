package org.la.core.java.student.moshin.assignment10;

public class Elementory extends School{
    @Override
    void numStudents(int numStudents) {
        System.out.println("Elementory has "+ numStudents+" students");
    }

    @Override
    String address() {
        return "300 bispo north side";
    }

    @Override
    void name(String name) {
        System.out.println("School's name is "+ name);
    }
}
