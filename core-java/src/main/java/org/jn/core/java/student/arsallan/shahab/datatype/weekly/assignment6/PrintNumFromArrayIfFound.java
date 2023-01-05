package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class PrintNumFromArrayIfFound {

	public static void main(String[] args) {
		int[] arr = {1,2,3,45,6,7,8,9};
		int num = 4;
		int data = checkNum(arr,num);
		System.out.println(data==0?"no it does not exist":"yes it exist "+data);
	}
	static int checkNum(int[] arr,int num) {
		for(int x:arr) {
			if(x==num) {
				 num = x;
			}
			
		}
		return num;
	}

}
