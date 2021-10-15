package org.la.test.code.codility;

public class MaximalBinaryOnesSpan {

    public static void main(String[] args) {

        int s[] = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1};
        s = new int[]{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        s = new int[]{0, 0, 0, 0, 0, 0, 0};
        s = new int[]{1, 0, 0, 0, 1, 0, 0, 1, 0};
        s = new int[]{0, 0, 0, 1, 0, 0, 1, 0, 1, 0};
        s = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int result = solution(s);
        System.out.println("result: "+result);
    }

    static int solution(int[] A) {
        int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        while (i >= 0) {
            if (A[i] == 1) {
                k = k + 1;
                if (k >= maximal) {
                    maximal = k;
                    result = i;
                }
            }
            else
                k = 0;
            i = i - 1;
        }
        if (A[i+1] == 1 && k + 1 > maximal)
            result = 0;
        return result;
    }

}
