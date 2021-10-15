package org.la.test.code.link.list;

public class LInkListFour {

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
	
	void add(int data) {
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
	
	void display() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		LInkListFour llf = new LInkListFour();
		llf.add(1);
		llf.add(4);
		llf.add(2);
		llf.add(5);
		llf.add(3);
		
		llf.display();
	}
}
