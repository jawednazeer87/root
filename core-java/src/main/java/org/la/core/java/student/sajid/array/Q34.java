package org.la.core.java.student.sajid.array;

public class Q34 {
//	34) wap to remove all zero element from an array?
	public static void main(String[] args) {
		int[] array = {0, 5, 6, 0, 0, 2, 5};
        int len = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] != 0)
                len++;
        }
        int [] newArray = new int[len];
        for (int i=0, j=0; i<array.length; i++){
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        for(int i=0;i<newArray.length;i++) {
            System.out.println(newArray[i]);

        }
	}

}
