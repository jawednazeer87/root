package org.la.test.code.accenture.cart.cataglogue.model;

import java.math.BigDecimal;
import java.util.Objects;

final public class Product {

    private final String name;
    private final int barcode;
    private final BigDecimal price;

    public Product(String name, int barcode, BigDecimal price) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getBarcode() {
        return barcode;
    }

    public BigDecimal getPrice() {
        return price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barcode == product.barcode && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, barcode);
    }
}
