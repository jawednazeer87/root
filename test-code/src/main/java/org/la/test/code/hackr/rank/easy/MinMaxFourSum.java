package org.la.test.code.hackr.rank.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MinMaxFourSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        //System.out.println(arr);
        long sum = arr.stream().mapToInt(Integer::intValue).limit(4).sum();
        sum = arr.stream().mapToLong(i -> i).limit(4).sum();
        long rs = 0;
        int size = arr.size();
        for (int i=1 ; i<=4 ; i++) {
            rs += arr.get(size-i);
        }
        System.out.println(sum+" "+rs);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 0, -1, -1);
        list = Arrays.asList(-4, 3, -9, 0, 4);
        miniMaxSum(list);
    }
}
