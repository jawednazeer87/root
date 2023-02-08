package org.jn.core.java.student.shoaeeb.strings.programs;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2= new String("I am learning java");
		char arr[] = {'t','h','i','s',' ',' ','i','s','a',' ',' ','g','a','m','e'};
		String s3 = new String(arr);
		
		System.out.println("Length of string "+s1.length());
		
		System.out.println("concat s1 and s2");
		System.out.println(s1.concat(s2));
		
		boolean x=s1.startsWith("A");
		if(x)
		{
			System.out.println("Starts with \'A\'");
		}
		else {
			System.out.println("Doesn't starts with \'A\'");
		}
		
		System.out.println("Concat of 3 strings:");
		System.out.println(s1+s2+s3);
		
		String p = s1.substring(1, 3);
		String q = s2.substring(1,5);
		
		System.out.println("P: "+p+" Q:"+q);
		
		
		System.out.println("to uppercase: "+s1.toUpperCase());
		System.out.println("to lowercase: "+s2.toLowerCase());
	}

}
