package org.la.core.java.student.moshin.assignment10;

public class HighSchool extends School{
        @Override
        void numStudents(int numStudents) {
                System.out.println("Hight school has "+numStudents+" students");
        }

        @Override
        String address() {
                return "150 bispo north side";
        }

        @Override
        void name(String name) {
                System.out.println("High School name is "+ name);
        }
}
