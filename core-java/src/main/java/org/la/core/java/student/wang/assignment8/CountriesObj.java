package org.la.core.java.student.wang.assignment8;

public class CountriesObj {
    public static void main(String[] args) {
        Countries countries = new Countries();
        countries.setCode(1);
        countries.setContinentName("Asia");
        countries.setName("China");

        System.out.println("countries.getCode() = " + countries.getCode());
        System.out.println("countries.getName() = " + countries.getName());
        System.out.println("countries.getContinentName() = " + countries.getContinentName());
    }
}
