package org.la.core.java.student.wang.assignment10.Task07;

public abstract class Worker {
    private int getId() {
        return 100;
    }

    public String getName(){
        return "Wang";
    };
    abstract protected void setEmail();

    void setWeight() {
        System.out.println("set weight is 100");
    }
}
