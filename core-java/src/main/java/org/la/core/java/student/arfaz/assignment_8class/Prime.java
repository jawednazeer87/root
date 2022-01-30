package org.la.core.java.student.arfaz.assignment_8class;

public class Prime {
	private int number;
	
	public void seta(int fir) {
		number=fir;
	}
	public int geta() {
		return number;
	}
	
	
	
	public boolean isPrime()
    {
        for(int i = 2; i < number; i++)
	{
	    if(number % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
