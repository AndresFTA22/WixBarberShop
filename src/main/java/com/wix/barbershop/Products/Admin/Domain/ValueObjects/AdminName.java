package com.wix.barbershop.Products.Admin.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AdminName extends StringValueObject {
    public AdminName(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
