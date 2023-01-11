package org.jn.core.java.student.shoaeeb.dsa;

public class Queue {
	private int arr[];
	private int front;
	private int back;
	private int capacity;
	
	Queue(int size)
	{
		arr= new int[size];
		front=-1;
		back=-1;
		capacity=size;
	}
	//enqueue
	public void enqueue(int x)
	{
		
		if(back==capacity-1)
		{
			System.out.println("Queue Overflow");
			System.exit(1);
		}
		arr[++back]=x;
		if(front==-1)
		{
			front++;
		}	
	}
	//dequeue 
	public void dequeue() {
		if(front==-1 || front>back)
		{
			System.out.println("Queue Underflow!");
			System.exit(1);
		}
		front++;
	}
	public void display() {
		for(int i=front; i<=back; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(5);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
	}

}
