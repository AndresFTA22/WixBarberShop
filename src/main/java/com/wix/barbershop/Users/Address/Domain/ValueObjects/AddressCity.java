package com.wix.barbershop.Users.Address.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AddressCity extends StringValueObject {
    public AddressCity(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
