package com.wix.barbershop.Users.Address.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AddressDetail extends StringValueObject {
    public AddressDetail(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
