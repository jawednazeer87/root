package org.jn.core.java.student.shoaeeeb.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StudentDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name,age and student code");
		String str=br.readLine();
		StringTokenizer st = new StringTokenizer(str,",");
		String name = st.nextToken();
		int age =Integer.parseInt(st.nextToken());
		String code =st.nextToken();
		
		System.out.printf("Name: %s Age:%d StudentCode: %s",name,age,code);
		
	}

}
