package com.wix.barbershop.Users.Phone.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class PhoneId extends CustomUUID {
    public PhoneId(String value) {
        super(value);
    }
}
