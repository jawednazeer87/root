package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		LinkedList<Integer> li = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice=0;
		
		while(choice<5)
		{
			System.out.println("LinkedList Operations");
			System.out.println("1.Add an element");
			System.out.println("2.Remove an element");
			System.out.println("3.Change an element");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element to add");
				int ele=Integer.parseInt(br.readLine());
				li.add(ele);
				break;
			case 2:
				System.out.println("Enter the element to remove" );
				int remove = Integer.parseInt(br.readLine());
				li.remove(remove);
				break;
			case 3:
				System.out.println("Enter the element");
				ele=Integer.parseInt(br.readLine());
				System.out.println("Enter the postion");
				int position=Integer.parseInt(br.readLine());
				li.set(position-1, ele);
				break;
			case 4:
				System.out.println(li);
				break;
			default:
				System.exit(0);
				
			}
		}//end of while
	}

}
