package org.la.core.java.student.wang.assignment9.Class0226Note;

import java.util.HashMap;
import java.util.Map;

public class UserMapMain {
    public static void main(String[] args) {

        Map<User,Integer> map= new HashMap<>();
        User user1 = new User(1,"wang");
        User user2 = new User(2,"Ma");
        User user3 = new User(3,"Liu");
        User user4 = new User(1,"Abraham");
        map.put(user1,1);
        map.put(user2,2);
        map.put(user3,3);
        map.put(user4,4);

        Integer i ;
        i = map.get(user1);
        System.out.println("i = " + i);
        i = map.get(user2);
        System.out.println("i = " + i);
        i = map.get(user3);
        System.out.println("i = " + i);
        i = map.get(user4);
        System.out.println("i = " + i);
    }
}
