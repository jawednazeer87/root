package org.la.test.code.baeldung;

public class OrderState implements PackageState{

    @Override
    public void prev(Package p) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void next(Package p) {
        p.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
