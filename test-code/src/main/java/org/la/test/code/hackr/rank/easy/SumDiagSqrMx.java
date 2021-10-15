package org.la.test.code.hackr.rank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDiagSqrMx {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sd1 = 0;
        int sd2 = 0;
        int size = arr.size()-1;
        for(int i=0 ; i<arr.size() ; i++){
            sd1 += arr.get(i).get(i);
            sd2 += arr.get(i).get(size-i);
        }
        return Math.abs(sd1-sd2);
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(1, -2, -3);
        List<Integer> l3 = Arrays.asList(-1, 2, 3);
        List<List<Integer>> ll = new ArrayList<>();
        ll.add(l1);
        ll.add(l2);
        ll.add(l3);
        int s = diagonalDifference(ll);
        System.out.println("sum: "+s);
    }
}
