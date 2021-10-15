package org.la.student.one.asif.service.impl;

import org.la.student.one.asif.service.FakeVehicleI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("kia")
public class KIA implements FakeVehicleI{

	@Override
	public String name() {
		return "KIA";
	}
}
