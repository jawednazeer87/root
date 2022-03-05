package org.la.core.java.student.wang.assignment10.Task07;

public class Staff extends Worker{
    @Override
    public String getName() {
        return "Wang";
    }

    @Override
    protected void setEmail() {
        System.out.println("10000344@gmail.com");
    }

    @Override
    void setWeight() {
        System.out.println("weight is 90");;
    }
}
