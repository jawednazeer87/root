package org.la.test.code.link.list;

public class MyLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2); 
		int r = myLinkedList.get(1);
		System.out.println("res: "+r);
		myLinkedList.deleteAtIndex(1);
		r = myLinkedList.get(1);
		System.out.println("res: "+r);
		myLinkedList.print();
		
	}
	
	public void print() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	//Link List class
	class Node {
		int val;
		Node next;
		Node(int val, Node next){
			this.val = val;
			this.next = next;
		}
	}
	
	//appending node
	public void add(int val) {
		Node newNode = new Node(val, null);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	//adding new node at head
	void addAtHead(int val) {
		Node current = new Node(val, null);
		current.next = head;
		head = current;
	}
	
	//appending new node at tail
	void addAtTail(int val) {
		Node newNode = new Node(val, null);
		if(head==null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = newNode;	
	}
	
	
	//get indexth element, if index is not valid then return -1
	int get(int index) {
		
		Node current = head;
		
		for(int i=0 ; current!=null ; i++) {
			if(i==index) {
				return current.val;
			}
			current = current.next;
		}
		return -1;
	}
	
	void addAtIndex(int index, int val) {
		Node newNode = new Node(val, null);
		if(head==null) {
			head = newNode;
			return;
		}
		Node current = head;
		for(int i=1 ; current!=null ; i++) {
			if(i==index) {
				newNode.next = current.next;
				current.next = newNode;
				break;
			}
			else {
				current = current.next;
			}
		}
	}
	
	
	void deleteAtIndex(int index) {
		Node current = head;
		if(head==null) {
			System.out.println("empty list");
			return;
		}
		for(int k=1 ; current!=null ; k++) {
			if(k==index) {
				if(current.next!=null) {
					Node nextNode = current.next;
					if(nextNode.next!=null){
						current.next = nextNode.next;
					}
				}
			}
			else {
				current = current.next;
			}
		}
	}
	
	Node head;
	Node tail;
}
