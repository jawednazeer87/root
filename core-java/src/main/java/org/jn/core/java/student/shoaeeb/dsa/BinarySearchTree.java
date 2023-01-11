package org.jn.core.java.student.shoaeeb.dsa;

public class BinarySearchTree {
	public class node {
		private int data;
		private node left;
		private node right;
		
		node(int val)
		{
			this.data=val;
			this.left=null;
			this.right=null;
		}
		
	}
	
	public node insertBst(node root,int val)
	{
		if(root==null)
		{
			return new node(val);
		}
		else if(val<root.data)
		{
			root.left = insertBst(root.left,val);
		}
		else {
			root.right=insertBst(root.right,val);
		}
		return root;
	}
	public void preOrder(node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root=null;
		
		BinarySearchTree bs = new BinarySearchTree();
		root=bs.insertBst(root,5);
		bs.insertBst(root,1);
		bs.insertBst(root,3);
		bs.insertBst(root,4);
		bs.insertBst(root,2);
		bs.insertBst(root,7);
		
		bs.preOrder(root);
		


		

	}

}
