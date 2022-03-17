package com.wix.barbershop.Users.Address.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class AddressId extends CustomUUID {
    public AddressId(String value) {
        super(value);
    }
}
