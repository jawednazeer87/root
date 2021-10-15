package org.la.test.code.link.list;

public class LinkListOne {

	static class Node {
		Node next;
		int data;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	
	public static void main(String[] args) {
		
		LinkListOne llo = new LinkListOne();
		
		llo.head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		
		llo.head.next = two;
		two.next = three;
		Node temp = llo.head;
		
		while(temp!=null) {
			System.out.println("data: "+temp.data);
			temp = temp.next;
		}
	}
}
