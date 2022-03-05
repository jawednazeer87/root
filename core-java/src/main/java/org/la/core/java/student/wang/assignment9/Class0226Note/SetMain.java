package org.la.core.java.student.wang.assignment9.Class0226Note;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("four");
        set.add("one");
        set.add("two");
        set.add("five");

        System.out.println("set.size() = " + set.size());

        for (String s : set) {
            System.out.println(s);
        }


    }
}
