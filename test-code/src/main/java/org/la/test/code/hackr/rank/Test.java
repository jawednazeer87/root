package org.la.test.code.hackr.rank;

public class Test {

    public static void main(String[] args) {
        try{
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(b+d+x);
        }
        catch (NumberFormatException e){
            System.out.println("Bad number");
        }
    }
    public void hell(){
        System.out.println("asif");
    }
}
