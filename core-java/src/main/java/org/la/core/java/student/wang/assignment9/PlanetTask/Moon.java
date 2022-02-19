package org.la.core.java.student.wang.assignment9.PlanetTask;

public class Moon extends Planet {
    @Override
    public void name() {
        System.out.println("The planet is Moon");
    }

    @Override
    public void distance(int a) {
        a =1000;
        System.out.println("the distance from earth to moon is "+a);
    }
}
