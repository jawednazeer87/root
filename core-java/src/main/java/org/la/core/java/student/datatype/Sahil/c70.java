package org.la.core.java.student.datatype.Sahil;

public class c70 {

    public static void main(String[] args) {

        int i, N = 10000;
        for (i = 0; i < N; i++) {

            int num = i, sum = 0, temp = num, digits = 0;
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }
            temp = num;
            while (temp > 0) {
                int remainder = temp % 10;//r=3;
                sum += Math.pow(remainder, digits);
                temp = temp / 10; //result =15;
            }

            if (num == sum) {
                System.out.println(num + " is Armstrong number");
            }
        }
    }
}
