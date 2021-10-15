package org.la.test.code.collctn;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortingManual {

    public static void main(String[] args) {

        Map<Integer, Integer> iMap = new HashMap<>();
        iMap.put(5,50);
        iMap.put(2,20);
        iMap.put(1,10);
        iMap.put(4,40);
        iMap.put(3,30);

        LinkedHashMap<Integer, Integer> lm = iMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue, (o1, o2)->o1, LinkedHashMap::new)
                        );
        iMap.forEach((k,v) -> {
            System.out.println(k+" : "+v);
        });

        iMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("reverse order");
        lm.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
