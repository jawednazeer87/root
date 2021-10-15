package org.la.test.code.baeldung;

public class ReceivedState implements PackageState{

    @Override
    public void prev(Package p) {
        p.setState(new DeliveredState());
    }

    @Override
    public void next(Package p) {
        System.out.println("Package already received by a client.");
    }

    @Override
    public void printStatus() {

    }
}
