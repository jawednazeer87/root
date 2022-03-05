package org.la.core.java.student.wang.assignment9.Class0226Note;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","jian");
        map.put("id", "1234");
        map.put("email","123123451@gmail.com");
        String id = map.get("id");
        System.out.println("id = " + id);

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println("Key: "+stringStringEntry.getKey()+" , value: "+stringStringEntry.getValue());
        }
    }
}
