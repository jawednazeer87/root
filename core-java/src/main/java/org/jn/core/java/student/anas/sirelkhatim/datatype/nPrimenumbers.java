package org.jn.core.java.student.anas.sirelkhatim.datatype;import java.util.*;

public class nPrimenumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int number;
        int status = -1;
        int num = 3;
        
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        
        number = scanner .nextInt();
        if(number >= 1) {
            System.out.println("First" + number + "prime numbers are: ");
            System.out.println(2);
        }

        for ( int i = 2 ; i <=number ;  )
        {
           for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
           {
              if ( num%j == 0 )
              {
                 status = 0;
                 break;
              }
           }
           if ( status != 0 )
           {
              System.out.println(num);
              i++;
           }
           status = 1;
           num++;
        }         
     }
  }
