package org.la.core.java.student.arfaz.assignment_10_class;

public class ProducOptionRelationtMain {

	public static void main(String[] args) {
		ProductOptionRelation pob =  new ProductOptionRelation();
//		productId, optionId
		pob.setProductId(12);
		pob.setOptionId(21);
		System.out.println(pob.getOptionId());
		System.out.println(pob.getProductId());
	}

}
