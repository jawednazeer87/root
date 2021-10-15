package org.la.test.code.baeldung;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class StateTestClass {

    @Test
    public void givenNewPackage_whenPackageReceived_thenStateReceived(){
        Package pkg = new Package();
        assertThat(pkg.getState() instanceof OrderState);
    }

}
