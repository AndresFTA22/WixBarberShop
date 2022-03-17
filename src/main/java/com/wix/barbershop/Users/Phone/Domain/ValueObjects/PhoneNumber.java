package com.wix.barbershop.Users.Phone.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.IntegerValueObject;

public class PhoneNumber extends IntegerValueObject {
    public PhoneNumber(int value) {
        validate(value);
        this.value =value;
    }
    public void validate(int value){

    }
}
