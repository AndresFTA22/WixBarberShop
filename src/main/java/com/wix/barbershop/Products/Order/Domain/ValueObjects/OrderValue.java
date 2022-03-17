package com.wix.barbershop.Products.Order.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.DoubleValueObject;

public class OrderValue extends DoubleValueObject {
    public OrderValue(double value) {
        validate(value);
        this.value = value;
    }
    public void validate(double value){

    }
}
