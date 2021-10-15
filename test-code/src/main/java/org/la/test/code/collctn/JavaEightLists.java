package org.la.test.code.collctn;

import java.util.*;
import java.util.stream.Collectors;

public class JavaEightLists {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 3, 2,1));

        List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5);     //list created this cannot change size
        /*
            The returned list implements the optional Collection methods, except those that would change the size of
            the returned list. Those methods leave the list unchanged and throw UnsupportedOperationException.
         */
        //iList.remove(2);      throw unsupportedoperationexception
        //list.remove(0);
        System.out.println(iList);
        iList.forEach(l -> System.out.println(l));

        List<Integer> collect = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }

}
