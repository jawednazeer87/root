package org.la.test.code.algo.rskw.model;

public class Salary implements Comparable<Salary>{

    private Integer salary;
    public Salary(){}
    public Salary(Integer sal){
        salary = sal;
    }
    @Override
    public int compareTo(Salary s){
        return this.salary.compareTo(s.salary);
    }
    @Override
    public String toString() {
        return salary + " ";
    }
}
