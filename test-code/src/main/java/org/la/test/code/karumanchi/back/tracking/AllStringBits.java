package org.la.test.code.karumanchi.back.tracking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class AllStringBits {

    static final Logger log = LoggerFactory.getLogger(AllStringBits.class);

    static int a[] = new int[3];
    public static void main(String[] args) {

        binary(a.length);
    }

    static void binary(int len){
        if(len<1){
            Arrays.stream(a).forEach(e -> System.out.print(" "+e));
            System.out.println("");
        }
        else{
            a[len-1] = 0;
            binary(len-1);
            a[len-1] = 1;
            binary(len-1);
        }
    }
}
