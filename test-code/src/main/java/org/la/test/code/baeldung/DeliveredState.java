package org.la.test.code.baeldung;

public class DeliveredState implements PackageState{

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderState());
    }

    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
