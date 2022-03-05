package org.la.core.java.student.wang.assignment10.Task04;

public abstract class School {
    abstract void numStudents(int numStudents);
    abstract String address() ;
    void name(String name){
        System.out.println("School's name is "+name);
    };
}
