package org.la.test.code.hackr.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UniquePairsWithSameDiff {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,2,2,3,1,4,5,0,-1);
        int r = findUniqueDDiffPairs(a, 1);
        System.out.println("result: "+r);
    }

    public static int findUniqueDDiffPairs(List<Integer> arr, int d) {
        List<String> list = new ArrayList<>();
        int count = 0;
        int len = arr.size();
        for(int x=0 ; x<len ; x++){
            for(int y=x+1 ; y<len ; y++){
                if(Math.abs(arr.get(x)-arr.get(y))==d && !list.contains(arr.get(x)>arr.get(y)?arr.get(x)+""+arr.get(y):arr.get(y)+""+arr.get(x))){
                    count++;
                    list.add(arr.get(x)>arr.get(y)?arr.get(x)+""+arr.get(y):arr.get(y)+""+arr.get(x));
                }
            }
        }
        return count;
    }

}