package org.la.core.java.student.wang.assignment8;

public class StuffObj {
    public static void main(String[] args) {

        Stuff stuff = new Stuff();
        stuff.setId(1);
        stuff.setStuffName("apple");
        stuff.setThumbnails(true);

        System.out.println("stuff.getId() = " + stuff.getId());
        System.out.println("stuff.getStuffName() = " + stuff.getStuffName());
        System.out.println("stuff.isThumbnails() = " + stuff.isThumbnails());

    }
}
