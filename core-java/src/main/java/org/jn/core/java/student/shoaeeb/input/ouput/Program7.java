package org.jn.core.java.student.shoaeeb.input.ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Program7 {
	//accepting all input in a single line
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id,Gender(M/F),Name");
		String str=br.readLine();
		String s1,s2,s3;
		StringTokenizer st = new StringTokenizer(str," , ");
		s1=st.nextToken();
		s2=st.nextToken();
		s3=st.nextToken();
		
		
		//removing spaces
		s1.trim();
		s2.trim();
		s3.trim();
		int id = Integer.parseInt(s1);
		String gender = s2;
		String name=s3;
		
		System.out.println("Id: "+id+" Gender: "+gender+" Name: "+name);
		
	}

}
