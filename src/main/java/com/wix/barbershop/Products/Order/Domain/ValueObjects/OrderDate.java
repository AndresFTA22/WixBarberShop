package com.wix.barbershop.Products.Order.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class OrderDate extends StringValueObject {
    public OrderDate(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
