package org.la.core.java.student.wang.assignment10.Task03;

public class PlanetMain {
    public static void main(String[] args) {
        Planet planet = new Earth();
        planet.read();
        planet.distance(999999999);

        planet = new Moon();
        planet.read();
        planet.distance(1000000);
    }
}
