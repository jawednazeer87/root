package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.ArrayList;
import java.util.List;

public class CovertArrayInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int [] a= {1,2,3,4,5,6,7,8};
 

 
 List <Integer> list = new ArrayList<>();
 
  for (int i:a) {
  list.add(i);
  }
 System.out.println("Integer List :"+list);
	}

}



//Convert integer array to integer list
//int[] a = {1, 2, 3, 4, 5, 6, 7, 8};