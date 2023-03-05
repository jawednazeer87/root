package org.jn.core.java.jawed.test;

import static org.junit.Assert.assertEquals;  
import org.jn.core.java.jawed.model.Mango;
import org.jn.core.java.jawed.model.dto.MangoDTO;
import org.jn.core.java.jawed.util.MangoUtil;
import org.junit.Before;
import org.junit.Test;  

public class MangoTest {

	Mango mango = null;
	@Before
    public void init() {
		mango = new Mango("red", "delicious", 1);
    }
	
	@Test 
	public void toDTOTest() {
		MangoDTO mangoDTO = MangoUtil.toDTO(mango);
		assertEquals(mangoDTO.getWeight(), 1);
	}
	
	@Test 
	public void toDTOAutoTest() {
		MangoDTO mangoDTO = MangoUtil.toDTOAuto(mango);
		assertEquals(mangoDTO.getColor(), "red");
	}
	
	@Test 
	public void toDTOAuto2Test() {
		MangoDTO mangoDTO = MangoUtil.toDTOAuto2(mango);
		MangoDTO mangoDTO2 = new MangoDTO("red", "delicious", 12);
		assertEquals(mangoDTO, mangoDTO2);
	}
	
}
