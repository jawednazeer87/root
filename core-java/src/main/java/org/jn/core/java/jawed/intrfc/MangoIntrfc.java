package org.jn.core.java.jawed.intrfc;

import org.jn.core.java.jawed.model.Mango;

@FunctionalInterface
public interface MangoIntrfc {

	Mango[] filter(Mango[] array, String str);
}
