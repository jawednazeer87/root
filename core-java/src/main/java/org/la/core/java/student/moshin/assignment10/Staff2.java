package org.la.core.java.student.moshin.assignment10;

public class Staff2 extends Worker{
    @Override
    public String getName() {
        return "moshin";
    }

    @Override
    protected void setEmail() {
        System.out.println("10000344@gmail.com");
    }

    void setWeight() {
        System.out.println("weight is 90");;
    }
}
