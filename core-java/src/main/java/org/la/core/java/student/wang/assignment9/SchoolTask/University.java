package org.la.core.java.student.wang.assignment9.SchoolTask;

public class University extends School{
    public int numOfStudents;
    public String address, nameOfSchool;

    public University(int a, String address, String b) {
        super(a, address, b);
    }

    @Override
    public void numStudents(int a) {
        numOfStudents = a;
    }

    @Override
    public String address() {
        return address;
    }

    @Override
    public void name(String b) {
        nameOfSchool = b;
    }
}
