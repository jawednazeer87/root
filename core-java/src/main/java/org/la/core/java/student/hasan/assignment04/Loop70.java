package org.la.core.java.student.hasan.assignment04;

public class Loop70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, num=1000, rem, sum = 0;
        for(int i = 1; i <= num; i++)
        {
            temp = i;
            while(temp > 0)
            {
                rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	}

}
