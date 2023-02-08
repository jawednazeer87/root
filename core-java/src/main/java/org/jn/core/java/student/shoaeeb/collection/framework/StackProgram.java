package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice=0;
		
		while(choice<4)
		{
			System.out.println("Stack Operations");
			System.out.println("1.Push");
			System.out.println("2.POP");
			System.out.println("3.Search an element");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1: 
				System.out.println("Enter element to push");
				int ele=Integer.parseInt(br.readLine());
				st.push(ele);
				break;
			case 2:
				ele=st.pop();
				System.out.println("Popped element: "+ele);
				break;
			case 3:
				
				System.out.println("Enter element to Search: ");
				ele=Integer.parseInt(br.readLine());
				int position=st.search(ele);
				if(position==-1)
					System.out.println("element not found");
				else
					System.out.println("element found at position:"+(position));
				break;
			default:
				System.exit(0);
			}
		}//end of while
	}

}
