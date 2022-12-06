package org.jn.core.java.student.azhan.array;

public class Problem53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] =  {'a', '5', '7', 'p'};
		for(int x:arr)
			if(x=='a')
			{
				System.out.println("this array has 'a'");
				return;
			}
		System.out.println("this array doesn't have 'a'");
	}

}
