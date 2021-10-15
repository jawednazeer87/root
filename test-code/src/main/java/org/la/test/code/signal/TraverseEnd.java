package org.la.test.code.signal;

import java.util.Arrays;
import java.util.stream.Stream;

public class TraverseEnd {

    public static void main(String[] args) {
        int[][] b = {{2,3},{1,2}};
        boolean result =traverse(5, 4, b, null);
        System.out.println("result: "+result);
    }

    static boolean traverse(int n, int m, int[][] block, int[][] telep){

        boolean result = false;

        int[][] arr = new int[n][m];
        for(int i=0 ; i<block.length ; i++){
            arr[block[i][0]][block[i][1]] = 1;
        }
        printString(arr);
        //print(arr);
        return result;
    }

    static void print(int[][] a){
        Stream.of(a).flatMap(Stream::of)
                .forEach(System.out::println);
    }
    static void printString(int[][] a){
        System.out.println(Arrays.deepToString(a));
    }

}
