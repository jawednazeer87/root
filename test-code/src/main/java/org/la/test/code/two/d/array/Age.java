package org.la.test.code.two.d.array;

public class Age implements Comparable<Age>{
    private Integer age;
    public Age(int a){
        age = a;
    }
    @Override
    public int compareTo(Age a){
        return this.age.compareTo(a.age);
    }
    @Override
    public String toString() {
        return "" + age;
    }
}
