package org.jn.core.java.student.shoaeeb.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Program6 {
	//use of StreamTokenizer
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id,Gender,Name");
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3= st.nextToken();
		
		int id = Integer.parseInt(s1);
		String name = s3;
		
		System.out.println(id+ " "+name);
		
		
		
		
		
	}

}
