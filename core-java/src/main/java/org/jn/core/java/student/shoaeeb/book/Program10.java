package org.jn.core.java.student.shoaeeb.book;

public class Program10 {
	//3d arrays
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int threeDArr[][][] = {
				{{51,52,53},{60,61,62}},
				{{61,76,53},{60,80,62}},
				{{51,52,53},{60,61,65}}
		};
		int total=0;
		//printing the array
		for(int i=0; i<3; i++)
		{
			System.out.println("Department "+(i+1));
			for(int j=0; j<2; j++)
			{
				System.out.println("Student "+(j+1));
				for(int k=0; k<3; k++)
				{
					System.out.print(threeDArr[i][j][k]+ " ");
					total+=threeDArr[i][j][k];
				}
				System.out.println("Total: "+total);
				total=0;
			}
		}
	}

}
