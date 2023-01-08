package org.jn.core.java.jawed.intrfc;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.jawed.model.Mango;

public class MangoIntrfcImpl implements MangoIntrfc {

	@Override
	public Mango[] filter(Mango[] array, String taste) {
		List<Mango> list = new ArrayList<>();
		for (Mango mango: array) {
			if (mango.getTaste().equalsIgnoreCase(taste)) {
				list.add(mango);
			}
		}
		return list.toArray(new Mango[] {});
	}
}
