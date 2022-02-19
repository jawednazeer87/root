package org.la.core.java.student.majeed.assignment8;

/*
22.	Create a class ProductOptionRelation having member variables productId, optionId. 
create getters and setters for all member variables. Create object of ProductOptionRelation class
in other class inside main method and set all member values and print all member values using getters.
*/

public class ProductOptionRelation {
    private int productId;
    private int optionId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }	
}
