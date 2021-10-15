package org.la.test.code.hackr.rank;

import org.springframework.data.relational.core.sql.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    https://www.hackerrank.com/challenges/magic-square-forming/problem
    In this program we have to create magic square by subtracting or adding some value to wrong elements
    each change value will cost as weight,
    magic square is a 2d matrix where each n every column n row and diagnol sum is 15 for 3*3 matrix.
    5 is always at middle and corners are even numbers with 2 and 8 always opposite n same applies for 4 n 6
    numbers are 1 to 9, not a single element will repeat
    For 3*3 matrix maximum num of magiz squares are 8
    so I created 8 matrix in 3d matrix and taking each square matrix n comparing with provided matrix
    n got result
    This program is easy but we must know the basic idea of square matrix
 */
public class FormingMagicSquareMinimalCost {

    public static void main(String[] args) {

        List<Integer> iList1 = new ArrayList<>(Arrays.asList(2,7,6));
        List<Integer> iList2 = new ArrayList<>(Arrays.asList(9,5,1));
        List<Integer> iList3 = new ArrayList<>(Arrays.asList(4,3,8));
        iList1 = new ArrayList<>(Arrays.asList(5, 3, 4));
        iList2 = new ArrayList<>(Arrays.asList(1, 5, 8));
        iList3 = new ArrayList<>(Arrays.asList(6, 4, 2));
        iList1 = new ArrayList<>(Arrays.asList(4, 9, 2));
        iList2 = new ArrayList<>(Arrays.asList(3, 5, 7));
        iList3 = new ArrayList<>(Arrays.asList(8, 1, 5));

        iList1 = new ArrayList<>(Arrays.asList(4, 9, 2));
        iList2 = new ArrayList<>(Arrays.asList(3, 5, 7));
        iList3 = new ArrayList<>(Arrays.asList(8, 1, 5));

        List<List<Integer>> oList = new ArrayList<>(Arrays.asList(iList1, iList2, iList3));
        int res = formingMagicSquare(oList);
        System.out.println("res: "+res);
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] magicSquares = new int[][][]{
                                                {{2,7,6},{9,5,1},{4,3,8}},
                                                {{8,3,4},{1,5,9},{6,7,2}},
                                                {{4,9,2},{3,5,7},{8,1,6}},
                                                {{6,1,8},{7,5,3},{2,9,4}},
                                                {{6,7,2},{1,5,9},{8,3,4}},
                                                {{2,9,4},{7,5,3},{6,1,8}},
                                                {{8,1,6},{3,5,7},{4,9,2}},
                                                {{4,3,8},{9,5,1},{2,7,6}}
                                            };

        int src[][] = new int[3][3];

        int i=0;
        for(List<Integer> oList : s){
            int j=0;
            for(Integer iVal : oList){
                src[i][j++] = iVal;
            }
            i++;
        }

        int min = Integer.MAX_VALUE;

        for(int[][] magicSquare : magicSquares){
            int temp = 0;
            for(int x=0 ; x<magicSquare.length ; x++){
                for(int y=0 ; y<magicSquare[x].length ; y++) {
                    temp += Math.abs(magicSquare[x][y]-src[x][y]);
                }
            }
            if(temp<min){
                min = temp;
            }
        }
        return min;
    }
}
