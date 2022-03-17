package com.wix.barbershop.Users.User.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class UserId extends CustomUUID {
    public UserId(String value) {
        super(value);
    }
}
