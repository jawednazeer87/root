package org.la.test.code.link.list;

public class MyLinkedList2 {

    Node head;
    Node tail;

    class Node {
        int val;
        Node next;
        Node(){}
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    /** Initialize your data structure here. */
    public MyLinkedList2() {

    }
    public int get(int index) {
        if(head==null){
            return -1;
        }
        Node current = head;
        for(int i=0 ; current!=null ; i++){
            if(i==index){
                return current.val;
            }
            else{
                current = current.next;
            }
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val, null);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val, null);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current!=null){
                current = current.next;
            }
            current = newNode;
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val, null);
        if(head==null && index==0) {
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

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node current = head;
        if(head==null) {
            System.out.println("empty list");
            return;
        }
        for(int k=0 ; current!=null ; k++) {
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
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */