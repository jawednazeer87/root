package org.jn.core.java.student.shoaeeb.dsa;

public class CircularQueue {
	
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	
	CircularQueue(int size)
	{
		arr = new int[size];
		front=-1;
		rear=-1;
		capacity=size;
	}
	
	//enqueue
	public void enqueue(int ele)
	{
		if(front==0 && rear==capacity-1)
		{
			System.out.println("Overflow");
			System.exit(1);
		}
		else if(front==-1)
		{
			front++;
			rear=(rear+1)%capacity;
			arr[rear]=ele;
			return;
		}
		else {
			rear=(rear+1)%capacity;
			arr[rear]=ele;	
		}
	}
	
	public void dequeue() {
		if(front==-1 || front>rear)
		{
			System.out.println("No element in queue");
			System.exit(1);
		}
		else {
			front=(front+1)%capacity;
		}
	}
	
	public int peek() {
		if(front==-1 || front>rear)
		{
			System.out.println("No element in queue");
			System.exit(1);
		}
		return arr[front];
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(1);
		System.out.println(cq.peek());
	}

}
