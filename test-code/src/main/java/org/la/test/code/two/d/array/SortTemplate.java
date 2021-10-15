package org.la.test.code.two.d.array;

import java.util.Arrays;

public class SortTemplate {

    public static void sort(Comparable[] a){

    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a){
        Arrays.stream(a).forEach(System.out::println);
    }
    public static boolean isSorted(Comparable[] a){
        return true;
    }
}
