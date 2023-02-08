package org.jn.core.java.student.shoaeeb.arrays.program;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dept,student,marks,total;
		
		int arr[][][] = {
				{{50,51,52},{60,61,62}},
				{{70,71,72},{80,81,82}},
				{{65,66,67},{75,76,77}}
		};
		for(dept=0; dept<3; dept++)
		{
			System.out.println("Department: "+(dept+1));
			for(student=0; student<2; student++)
			{
				total=0;
				System.out.println("Student: "+(student+1));
				for(marks=0; marks<3; marks++)
				{
					System.out.print(arr[dept][student][marks]+" ");
					total+=arr[dept][student][marks];
				}
				System.out.println("Total "+total);
			}
		}
		
		
	}

}
