package org.la.core.java.student.wang.assignment10.Task04;

public class HighSchool extends School{
        @Override
        void numStudents(int numStudents) {
                System.out.println("Hight school has "+numStudents+" students");
        }

        @Override
        String address() {
                return "150 E Las Tunas Ave, Alhambra";
        }

        @Override
        void name(String name) {
                System.out.println("High School name is "+ name);
        }
}
