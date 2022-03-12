package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

public class SearchChild extends Search
{
	@Override
	protected int search(String st, char c) 
	{
		int m = st.length();
		int n = 0;
		
		for(int i = 0 ; i < m; i++)
		{
			if(st.charAt(i) == c)
			{
				n = i;
				break;
			}
				n = -1;
		}
		return n;
	}
}
