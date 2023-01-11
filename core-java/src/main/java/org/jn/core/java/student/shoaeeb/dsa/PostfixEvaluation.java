package org.jn.core.java.student.shoaeeb.dsa;

import java.util.Stack;

public class PostfixEvaluation {

	
	public static int postfixEvaluation(String s)
	{
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				st.push(s.charAt(i)-'0');
			}
			else {
				int op2=st.peek();
				st.pop();
				int op1=st.peek();
				st.pop();
				switch(s.charAt(i))
				{
				case '+' :
						st.push(op1+op2);
						break;
				case '-': 
						st.push(op1-op2);
						break;
				case '*':
						st.push(op1*op2);
						break;
				case '/':
						st.push(op1/op2);
						break;
				
				case '^':
					st.push((int)Math.pow(op1, op2));
					break;
							
				}
			}
		}
		return st.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(postfixEvaluation("46+2/5*7+"));
	}

}
