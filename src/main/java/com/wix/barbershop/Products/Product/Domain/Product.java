package com.wix.barbershop.Products.Product.Domain;

import com.wix.barbershop.Products.Product.Domain.ValueObjects.*;

import java.util.HashMap;

public class Product {
    private ProductId productId;
    private ProductDescription productDescription;
    private ProductPrice productPrice;
    private ProductQuantity productQuantity;
    private ProductRating productRating;

    public Product(ProductId productId, ProductDescription productDescription, ProductPrice productPrice, ProductQuantity productQuantity, ProductRating productRating) {
        this.productId = productId;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productRating = productRating;
    }

    public static Product create(){
        return null;
    }

    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",productId.value());
                put("decription",productDescription.value());
                put("price",productPrice.value());
                put("quantity",productQuantity.value());
                put("rating",productRating.value());
            }

        };
        return data;
    }
}
