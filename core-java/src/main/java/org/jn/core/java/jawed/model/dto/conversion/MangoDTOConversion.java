package org.jn.core.java.jawed.model.dto.conversion;

import org.jn.core.java.jawed.model.Mango;
import org.jn.core.java.jawed.model.dto.MangoDTO;
//import org.jn.core.java.jawed.util.MangoUtil;
import static org.jn.core.java.jawed.util.MangoUtil.toDTOAuto2;

public class MangoDTOConversion {

	public static void main(String[] args) {
		Mango mango = new Mango("red", "delicious", 1);
//		MangoDTO mangoDTO = MangoUtil.toDTO(mango);
//		MangoDTO mangoDTO = MangoUtil.toDTOAuto(mango);
		MangoDTO mangoDTO = toDTOAuto2(mango);
		System.out.println("Mango DTO auto2: \n" + mangoDTO);
	}
}


