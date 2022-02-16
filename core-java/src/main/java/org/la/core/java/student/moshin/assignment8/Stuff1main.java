package org.la.core.java.student.moshin.assignment8;

public class Stuff1main {
	public static void main(String[] args) {

		Stuff1 stuff = new Stuff1();
        stuff.setId(1);
        stuff.setStuffName("vivo");
        stuff.setThumbnails(false);

        System.out.println("stuff.getId() = " + stuff.getId());
        System.out.println("stuff.getStuffName() = " + stuff.getStuffName());
        System.out.println("stuff.isThumbnails() = " + stuff.isThumbnails());

    }
}
