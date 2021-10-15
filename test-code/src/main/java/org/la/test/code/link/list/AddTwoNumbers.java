package org.la.test.code.link.list;

public class AddTwoNumbers {

	class ListNode {
		int val;
		ListNode next;
		
		ListNode(){}
		
		ListNode(int val, ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	
	public ListNode add(ListNode l1, ListNode l2) {
		
		ListNode head = new ListNode();
		ListNode current = head;
		int carry = 0;
		
		while(l1!=null || l2!=null || carry!=0) {
			int v1 = l1!=null ? l1.val : 0;
			int v2 = l2!=null ? l2.val : 0;
			int val = v1 + v2 + carry;
			
			//getting carry value
			carry = val / 10;
			
			//new node added
			current.next = new ListNode(val%10, null);

			//updating pointers
			current = current.next;
			
			l1 = l1!=null ? l1.next : null;
			l2 = l2!=null ? l2.next : null;
			
		}
		return head.next;
	}
	
}
