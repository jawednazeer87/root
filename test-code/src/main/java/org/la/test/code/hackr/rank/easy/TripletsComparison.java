package org.la.test.code.hackr.rank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsComparison {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(2);
        int sa = 0 ;
        int sb = 0;
        for(int i=0 ; i<a.size() ; i++){
            if(a.get(i)>b.get(i))
                sa++;
            else if(a.get(i)<b.get(i))
                sb++;
        }
        result.add(sa);
        result.add(sb);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = compareTriplets(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 4));
        System.out.println(list);
        System.out.println(list.size());
    }

}
