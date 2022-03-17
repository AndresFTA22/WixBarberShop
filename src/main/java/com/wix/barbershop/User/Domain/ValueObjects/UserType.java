package com.wix.barbershop.User.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class UserType extends StringValueObject {


    public UserType(String value) {
        validate(value);
        this.value = value;
    }


    private void validate(String value){

    }
}
