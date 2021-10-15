package org.la.student.one.asif.service.impl;

import org.la.student.one.asif.service.FakeVehicleI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bmw")
public class BMW implements FakeVehicleI{

	@Override
	public String name() {
		return "BMW";
	}

}
