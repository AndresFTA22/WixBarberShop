package com.wix.barbershop.User.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class UserPassword extends StringValueObject {


    public UserPassword(String value) {
        validate(value);
        this.value = value;
    }


    private void validate(String value){

    }
}
