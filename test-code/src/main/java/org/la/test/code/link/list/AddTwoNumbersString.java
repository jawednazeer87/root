package org.la.test.code.link.list;

import java.math.BigInteger;

/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbersString {

	class ListNode {
		int val;
		ListNode next;
		
		ListNode(){}
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val, ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
 		StringBuilder sb1 = new StringBuilder();
 		StringBuilder sb2 = new StringBuilder();
 		ListNode current = l1;
 		while(current!=null) {
 			sb1.append(current.val);
 			current = current.next;
 		}
 		current = l2;
 		while(current!=null) {
 			sb2.append(current.val);
 			current = current.next;
 		}
 		
 		//reverse number
 		sb1.reverse();
 		sb2.reverse();
 		BigInteger bg1 = new BigInteger(sb1.toString());
 		BigInteger bg2 = new BigInteger(sb2.toString());
 		
 		
 		//sum of reverse num
 		BigInteger bSum = bg1.add(bg2);
 		
 		//long to string builder
 		StringBuilder s = new StringBuilder(String.valueOf(bSum));
 		
 		//reverse sum
 		s.reverse();
 		
 		ListNode head = null;
 		
 		for(int i=0 ; i<s.length() ; i++) {
 			int k = Integer.valueOf(s.substring(i, i+1));
 			if(i==0) {
 	 			 head = new ListNode(k); 	
 	 			 current = head;
 			}
 			else {
 				ListNode l = new ListNode(k);
 				current.next = l;
 				current = l;
 			}

 		}
 		
 		return head;
    }

	ListNode head = null;
	ListNode tail = null;

	void add(int val) {
	
		ListNode nn = new ListNode(val);
		if(head==null) {
			head = nn;
			tail = nn;
		}
		else {
			tail.next = nn;
			tail = nn;
		}
	}
	
	void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.println(current.val);
			current = current.next; 
		}
	}
	
	public static void main(String[] args) {
		
		/*
		AddTwoNumbers atn = new AddTwoNumbers();
		atn.add(1);
		atn.add(6);
		atn.add(2);
		atn.add(3);
		atn.display();
		ListNode l1 = atn.head;
		
		System.out.println("\n");
		atn.head = null;
		atn.add(3);
		atn.add(9);
		atn.add(7);
		atn.add(8);
		atn.display();
		ListNode l2 = atn.head;
		System.out.println("\n");
		
		ListNode lf = atn.addTwoNumbers(l1, l2);
		atn.head = lf;
		atn.display();
		
		
		test();
		*/
		StringBuilder s1 = new StringBuilder("1623");
		StringBuilder s2 = new StringBuilder("3978");
		Long l1 = Long.parseLong(s1.reverse().toString());
		Long l2 = Long.parseLong(s2.reverse().toString());
		System.out.println("l1: "+l1);
		System.out.println("l2: "+l2);
		Long sum = l1 + l2;
		System.out.println("sum: "+sum);
		StringBuilder s = new StringBuilder(String.valueOf(sum));
		System.out.println("result: "+s.reverse());
		
		//"89990001" 45021
	}
	
	public static void test() {
		
		StringBuilder s1 = new StringBuilder("123");
		s1.reverse();
		System.out.println("rev: "+s1);
	}
}
