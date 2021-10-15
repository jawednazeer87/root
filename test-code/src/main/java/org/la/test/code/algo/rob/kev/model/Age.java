package org.la.test.code.algo.rob.kev.model;

public class Age implements Comparable<Age>{

    private Integer age;

    public Age(){}
    public Age(int age){
        this.age = age;
    }
    @Override
    public int compareTo(Age that) {
        return this.age.compareTo(that.age);
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
