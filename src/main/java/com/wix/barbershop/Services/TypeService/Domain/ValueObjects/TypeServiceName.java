package com.wix.barbershop.Services.TypeService.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class TypeServiceName extends StringValueObject {
    public TypeServiceName(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
