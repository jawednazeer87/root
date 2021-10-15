package org.la.test.code.inner.clas;

public class ExampleOne {

    public static class A {
        public char val = 'A';
        public char getVal(){
            System.out.println("A val: "+val);
            return val;
        }
    }

    public static class B extends A {
        public char val = 'B';
        public char getVal(){
            System.out.println("B val: "+val);
            return val;
        }
    }

    public static void main(String[] args) {
        A a = new B();
        System.out.println("a.val: "+a.val+"  \na.getVal(): "+a.getVal());
    }

}
