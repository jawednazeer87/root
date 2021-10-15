package org.la.test.code.link.list;

public class LinkListTwo {

	class Node {
		
		Node next;
		int data;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	Node tail;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void print() {
		Node current = head;
		while(current!=null) {
			System.out.println("Data: "+current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkListTwo llt = new LinkListTwo();
		llt.add(1);
		llt.add(2);
		llt.add(3);
		llt.add(4);
		llt.add(5);
		llt.print();
	}
	
}
