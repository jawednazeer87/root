package org.la.core.java.student.moshin.assignment10;

public abstract class Worker {
    private int getId() {
        return 100;
    }

    public String getName(){
        return "moshin";
    };
    abstract protected void setEmail();

    void setWeight() {
        System.out.println("set weight is 100");
    }
}
