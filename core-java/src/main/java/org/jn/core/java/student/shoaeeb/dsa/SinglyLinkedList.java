package org.jn.core.java.student.shoaeeb.dsa;

public class SinglyLinkedList {
	static int counter=0;
	class node {
		private int data;
		private node next;
		
		
		node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	node head=null;
	void insertAtFront(int data) {
		node n = new node(data);
		if(head==null)
		{
			head=n;
			counter++;
			return;
		}
		else {
			n.next=head;
			head=n;
			counter++;
		}
	}
	
	void insertAtTail(int data)
	{
		if(head==null)
		{
			insertAtFront(data);
			return;
		}
		else {
			node temp=head;
			node n=new node(data);
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			counter++;
		}
	}
	
	//display
	void display() {
		if(head==null)
		{
			return;
		}
		else {
			node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
		}
	}
	//delete at front
	void deleteAtFront() {
		if(head==null)
		{
			return;
		}
		else {
			head=head.next;
		}
	}
	//delete at pos
	void deleteAtPos(int pos)
	{
		if(pos==1)
		{
			deleteAtFront();
			return;
		}
		int count=0;
		node temp=head;
		while(count!=pos-1)
		{
			count++;
			temp=temp.next;
		}
		
		temp.next=temp.next.next;
		
	}
	node reverse() {
		node prev=null;
		node currptr=head;
		node nextptr;
		
		while(currptr!=null)
		{
			nextptr=currptr.next;
			currptr.next=prev;
			
			prev=currptr;
			currptr=nextptr;
		}
		return prev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList ls = new SinglyLinkedList();
		ls.insertAtFront(1);
		ls.insertAtTail(2);
		ls.insertAtTail(3);
		ls.insertAtTail(4);
		ls.insertAtTail(5);
		ls.display();
		ls.deleteAtFront();
		ls.deleteAtPos(2);
		System.out.println();
		ls.display();
		ls.head=ls.reverse();
		System.out.println();
		ls.display();
		
		

	}

}
