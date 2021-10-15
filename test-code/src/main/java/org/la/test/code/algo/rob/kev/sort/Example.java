package org.la.test.code.algo.rob.kev.sort;

import org.la.test.code.algo.rob.kev.model.Age;

public class Example {

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
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static boolean isSorted(Comparable[] a){
        for(int i=1 ; i<a.length ; i++){
            if(less(a[i], a[i-1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Age a[] = create();
        System.out.println("is sorted: "+isSorted(a));
    }
    private static Age[] create(){

        Age a1 = new Age(1);
        Age a2 = new Age(2);
        Age a3 = new Age(3);
        Age a4 = new Age(4);
        Age a5 = new Age(5);
        Age a6 = new Age(6);
        Age a7 = new Age(7);
        Age age[] = {a1, a2, a3, a4, a5, a6, a7};
        return age;
    }

}
