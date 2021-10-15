package org.la.test.code.baeldung;

public class Package {

    private PackageState state = new OrderState();

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState(){
        state.prev(this);
    }

    public void nextState(){
        state.next(this);
    }

    public  void printStatus(){
        state.printStatus();
    }

}
