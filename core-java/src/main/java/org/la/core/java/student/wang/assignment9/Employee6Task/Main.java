package org.la.core.java.student.wang.assignment9.Employee6Task;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(001);
        employee.setName("Wang");
        employee.setEmail("11003334@gmail.com");
        employee.setWeight(70);

        System.out.println("employee.getId() = " + employee.getId());
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getEmail() = " + employee.getEmail());
        System.out.println("employee.getWeight() = " + employee.getWeight());
    }
}
