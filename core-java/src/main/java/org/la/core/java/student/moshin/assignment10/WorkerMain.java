package org.la.core.java.student.moshin.assignment10;

public class WorkerMain {
    public static void main(String[] args) {
        Worker worker = new Staff2();
        System.out.println("worker.getName() = " + worker.getName());
        worker.setEmail();
        worker.setWeight();
    }
}
