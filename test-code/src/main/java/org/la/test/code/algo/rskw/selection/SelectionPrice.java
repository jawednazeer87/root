package org.la.test.code.algo.rskw.selection;

import org.la.test.code.algo.rskw.Sort;

public class SelectionPrice extends Sort {

    @Override
    public void sort(Comparable[] a){
        int len = a.length;
        for(int i=0 ; i<len ; i++){
            int min = i;
            for(int j=i+1 ; j<len ; j++){
                if(less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
    }
    public static void main(String[] args) {
        Sort s = new SelectionPrice();
        Integer[] a = s.createArray(10);
        s.sort(a);
        boolean res = s.isSorted(a);
        System.out.println("Is array sorted: "+res);
    }
}
