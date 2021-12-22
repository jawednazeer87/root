package org.la.core.java.student.mdfarman.loop.assignment4;



public class Question34 {
	//		34.	wap to print all upper case alphabets except vowels.

	static void check(char start, char end)
	{
		while(start<=end) {

			if (start == 'A' ||start == 'E' || start == 'I' || start == 'O' || start == 'U'||
					start == 'a' ||start == 'e' || start == 'i' || start == 'o' || start == 'u'	
					)
				System.out.print("");
			else
				System.out.println(start);
			start++;
		}
	}

	public static void main(String[] args) {

		char start1 = 'A' , end1 = 'Z' ;
		check(start1,end1);
		System.out.println("************** part b *************");
		char start2='a', end2='z';
		check(start2,end2);

	}
}
