package org.la.core.java.student.wang.assignment9.SchoolTask;

public class SchoolObjs {
    public static void main(String[] args) {

        College college = new College();
        college.numStudents(1000);
        System.out.println("college.address() = " + college.address());
        college.name("Alhambra College");

        Elementory elementory = new Elementory();
        elementory.numStudents(122);
        System.out.println("elementory.address() = " + elementory.address());
        elementory.name("Alhambra Elementory School");

        MiddleSchool middleSchool = new MiddleSchool();
        middleSchool.numStudents(1000);
        System.out.println("middleSchool.address = " + middleSchool.address());
        middleSchool.name("Alhambra Middle School");

        HighSchool highSchool = new HighSchool();
        highSchool.numStudents(200);
        System.out.println("highSchool.address() = " + highSchool.address());
        highSchool.name("Ahambra High School");

        University university =new University();
        university.numStudents(3910);
        System.out.println("university.address() = " + university.address());
        university.name("Alhambra University");


    }
}
