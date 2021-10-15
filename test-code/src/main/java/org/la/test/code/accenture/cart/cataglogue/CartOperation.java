package org.la.test.code.accenture.cart.cataglogue;

import org.la.test.code.accenture.cart.cataglogue.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartOperation {

    public List<Product> productList;
    Map<Integer, Integer> cartItems = new HashMap<>();

    public CartOperation(List<Product> productList){
        this.productList = productList;
    }

    public void add(int barcode){

        if(cartItems.size()>0){                 //checking that cart is not empty
            if(cartItems.get(barcode)!=null){   //if not null means barcode is already inside cart
                cartItems.put(barcode, cartItems.get(barcode)+1);       //just increasing the count of them same item
            }
            else{
                cartItems.put(barcode, 1);          //adding new item as it is not found in cart
            }
        }
        else{       //if cart is empty then simply adding item with count 1
            cartItems.put(barcode, 1);
        }
    }

}
