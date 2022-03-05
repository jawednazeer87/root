package org.la.core.java.student.wang.assignment10.Task07;

public class WorkerMain {
    public static void main(String[] args) {
        Worker worker = new Staff();
        System.out.println("worker.getName() = " + worker.getName());
        worker.setEmail();
        worker.setWeight();
    }
}
