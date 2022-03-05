package org.la.core.java.student.wang.assignment9.Class0226Note;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListStringSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("wang","apple","boy","gril");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("---after sorting---");
        System.out.println("list = " + list);
        System.out.println("---after reverse the list ---");
        Collections.reverse(list);
        System.out.println("list = " + list);

       // List<User> userList = UserUtil.get
    }
}
