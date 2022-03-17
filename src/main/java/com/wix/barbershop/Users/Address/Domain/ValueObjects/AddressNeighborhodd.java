package com.wix.barbershop.Users.Address.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AddressNeighborhodd extends StringValueObject {
    public AddressNeighborhodd(String value) {
        validate(value);
        this.value = value;

    }
    public void  validate(String value){

    }
}
