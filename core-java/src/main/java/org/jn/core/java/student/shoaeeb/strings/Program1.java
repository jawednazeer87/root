package org.jn.core.java.student.shoaeeb.strings;

public class Program1 {
	//String operations
	//String s="hello";
	//String s = new ("hello");
	//char arr[]=  ['c','h','a','i','r','s'];
	//String s = new String(arr);
	//String s = new String (arr,2,3);
	//String s = new String(arr,pos,no of characters);
	
	
	//s.length() returns the length or number of characters
	//charAt(i) returns the character at the position
	//compareTo()
	//compareToIgnoreCase();
	//boolean equals();
	//boolean equalsIgnoreCase()
	//boolean startsWith();
	//boolean endsWith();
	//int indexOf(s) //returns the first position of the substring  in a string
	//int lastIndexOf()
	//replace(char c1,char c2);
	//String substring(int i);
	//String substring(int i1,int i2)
	//String toUpperCase()
	//String toLowerCase()
	//String trim()
	//void getChars(int i1,int i2,arr,int i3)
	//String split(delimeter)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2 = new String("Hello");
		char arr[]={'D','r','e','a','m','t','e','c','h'};
		String s3 = new String(arr);
		
		if(s1.startsWith("H"))
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		String s4 = s1.substring(2,5);
		
		System.out.println(s4);
		
		int i = s1.indexOf("e");
		System.out.println(i);
		int j = s1.lastIndexOf("l");
		System.out.println(j);
		
	}

}
