package student.sajid.ternary.operator;

public class Q19 {
	public static void main(String[] args) {
		int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        if(a < b)
        {
            System.out.println("A is less than B");
        }
        if(a == b)
        {
            System.out.println("A is equal to B");
        }
        if(a > b)
        {
            System.out.println("A is greater than B");
        }
	
	}

}
