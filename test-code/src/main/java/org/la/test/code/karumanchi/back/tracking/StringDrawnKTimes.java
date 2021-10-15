package org.la.test.code.karumanchi.back.tracking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class StringDrawnKTimes {

    static final Logger log = LoggerFactory.getLogger(AllStringBits.class);

    static int a[] = new int[3];

    public static void main(String[] args) {

        int k = 1;
        takenKTimes(a.length, 3);
    }

    static void takenKTimes(int n, int k){
        if(n<1){
            Arrays.stream(a).forEach(e -> System.out.print(" "+e));
            System.out.println("");
        }
        else{
            for(int j=0 ; j<k ; j++){
                a[n-1] = j;
                takenKTimes(n-1, k);
            }
        }
    }

}
