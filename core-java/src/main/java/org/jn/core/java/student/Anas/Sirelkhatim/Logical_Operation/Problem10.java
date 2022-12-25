package org.jn.core.java.student.Anas.Sirelkhatim.Logical_Operation;

public class Problem10 {

    public static void main(String[] args) {
       
        boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on " + result);
        result = result && lampX;
        System.out.println("Lamp switch-on " + result);

    }

}
