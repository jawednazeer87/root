package org.la.core.java.student.datatype.Sahil;

public class d28 {
public static void main(String[] args) {
	   int[] a = {4, 2, 3, 1, 7};
       int[] resulta = new int[a.length-1];
       int element = 3;
       for (int i = 0, j =0; i < a.length; i++) {
           if (a[i]!=element){
               resulta[j++]=a[i];
           }
       }
       System.out.println("Arrays.toString(resultArr = )" +  "Arrays.toString"+ (resulta));
}
}
