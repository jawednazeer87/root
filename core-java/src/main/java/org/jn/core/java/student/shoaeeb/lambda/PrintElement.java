package org.jn.core.java.student.shoaeeb.lambda;

import java.util.function.Predicate;

public class PrintElement {

	public static void main(String args[])
	{
		Integer[] arr = {9,10,11,12,13,14,15};
		Predicate<Integer> gt = (n) -> {return n>10;};
		Predicate<Integer> lt = (n) -> {return n<15;};
		
		
		PrintElement.display(gt.and(lt),arr);
		PrintElement.display(lt,arr);
		
	}
	static void display(Predicate<Integer> p,Integer[] arr)
	{
		for(int ele: arr)
		{
			if(p.test(ele))
			{
				System.out.print(ele+" ");
			}
		}
	}
	

}
