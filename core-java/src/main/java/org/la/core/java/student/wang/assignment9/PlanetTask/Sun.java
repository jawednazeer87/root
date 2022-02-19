package org.la.core.java.student.wang.assignment9.PlanetTask;

public class Sun extends Planet{
    @Override
    public void name() {
        System.out.println("The planet is Sun");
    }

    @Override
    public void distance(int kilometer) {
        kilometer = 99999;
        System.out.println("the distance from earth to moon is "+kilometer);
    }
}
