package org.la.core.java.student.datatype.Sahil;

public class c58 {
	public static void main(String[] args) {

        int num = 12345,
                first,
                last,
                tmp = num,
                count = 0;

        last = num % 10; //5
        System.out.println("last = " + last);
        while (num > 10) {
            count++;
            num = num / 10;
        }
        first = num;//1
        num = tmp; //12345
        System.out.println("num = " + num);
        num = num / 10; //1234
        System.out.println("num = " + num);//1234
        System.out.println("count = " + count);//4
        int p = (int) Math.pow(10, count - 1);//count =4,  p = 1000
        int mid = num % p; //1234%1 =234
        System.out.println("mid = " + mid); //234

        int afterSwap = (int) Math.pow(10, count) * last + mid * 10 + first;
        //                      10000*5                  +  234*10   + 1
        //50000+2340+1 =52341
        System.out.println("afterSwap = " + afterSwap);

    }
}
