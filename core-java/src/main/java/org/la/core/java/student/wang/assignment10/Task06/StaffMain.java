package org.la.core.java.student.wang.assignment10.Task06;

public class StaffMain {
    public static void main(String[] args) {
        Staff staff = new Worker1();
        staff.setId(100);
        staff.setName("Wang");
        staff.setWeight(80.00);
        staff.setEmail("1003t56@gmail.com");
        System.out.println("staff.getId() = " + staff.getId());
        System.out.println("staff.getName() = " + staff.getName());
        System.out.println("staff.getEmail() = " + staff.getEmail());
        System.out.println("staff.getWeight() = " + staff.getWeight());

    }
}