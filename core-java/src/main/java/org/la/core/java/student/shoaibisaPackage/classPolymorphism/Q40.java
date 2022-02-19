package org.la.core.java.student.shoaibisaPackage.classPolymorphism;

class ParentFibo {
	public void fibonacci(int n) {
		System.out.println("Fibonacci series till "+n);
	}
}

class ChildFibo extends ParentFibo{
	
	@Override
	public void fibonacci(int n) {
		int prev=0, next=1, sum=0;
		
		while(n!=0) {
			prev=sum;
			sum = next+prev;
			next = prev;
			System.out.println(sum);
			n--;
		}
	}
}

public class Q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentFibo p = new ChildFibo();
		p.fibonacci(9);

	}

}
