package org.la.test.code.thred;

public class ThreadExample {

    public static void main(String[] args) {

        Runnable t = () -> {
            for (int i=1 ; i<10000000 ; i++) {
                System.out.print("Asif");
                if(i%38==0){
                    System.out.println();
                }
            }
        };

        t.run();

        for (int i=1 ; i<10000 ; i++){
            System.out.print("Jawed");
            if(i%30==0){
                System.out.println();
            }
        }
    }
}
