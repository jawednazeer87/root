package org.jn.core.java.student.shoaeeb.dsa;

public class Tree {
	private int data;
	private Tree left;
	private Tree right;
	
	Tree(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	
	void preOrder(Tree root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	void inOrder(Tree root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	void postOrder(Tree root)
	{
		if(root==null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree(1);
		tree.left = new Tree(2);
		tree.right = new Tree(3);
		tree.left.left= new Tree(4);
		tree.left.right = new Tree(5);
		tree.right.right = new Tree(3);
		tree.right.left=new Tree(6);
		tree.right.right = new Tree(7);
		//tree.preOrder(tree);
		tree.postOrder(tree);
		
	}

}
