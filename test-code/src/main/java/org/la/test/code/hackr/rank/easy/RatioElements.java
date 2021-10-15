package org.la.test.code.hackr.rank.easy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class RatioElements {
    public static void plusMinus(List<Integer> arr) {
        int pe = 0;
        int ne = 0;
        int ze = 0;
        for(int i : arr){
            if(i>0)
                pe++;
            else if(i<0)
                ne++;
            else
                ze++;
        }
        int size = arr.size();
        BigDecimal bdpe = new BigDecimal(pe);
        BigDecimal bdne = new BigDecimal(ne);
        BigDecimal bdze = new BigDecimal(ze);
        //bdpe = bdpe.setScale(6, RoundingMode.HALF_UP);
        //bdne = bdne.setScale(6, RoundingMode.HALF_UP);
        //bdze = bdze.setScale(6, RoundingMode.HALF_UP);
        bdpe = bdpe.divide(new BigDecimal(size), 6, RoundingMode.HALF_UP);
        bdne = bdne.divide(new BigDecimal(size), 6, RoundingMode.HALF_UP);
        bdze = bdze.divide(new BigDecimal(size), 6, RoundingMode.HALF_UP);

        System.out.println(bdpe);
        System.out.println(bdne);
        System.out.println(bdze);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 0, -1, -1);
        list = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(list);
    }
}
