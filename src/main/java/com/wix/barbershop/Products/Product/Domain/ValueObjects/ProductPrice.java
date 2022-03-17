package com.wix.barbershop.Products.Product.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.DoubleValueObject;

public class ProductPrice extends DoubleValueObject {
    public ProductPrice(double value) {
        validate(value);
        this.value=value;
    }
    public void validate(double value){

    }
}
