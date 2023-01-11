package org.jn.core.java.student.shoaeeb.dsa;

public class stack {
	private int arr[];
	private int top;
	private int capacity;
	
	
	stack(int size)
	{
		arr = new int[size];
		capacity = size;
		top=-1;
	}
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		else
			arr[++top]=x;
	}
	public void pop() {
		if(isEmpty())
		{
			System.out.println("Stack Underflow!");
			System.exit(1);
		}
		top--;
	}
	public boolean isFull() {
		return top==capacity-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public int Top()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack(5);
		s.push(1);
		System.out.println(s.Top());
		s.pop();
		s.pop();
	}

}
