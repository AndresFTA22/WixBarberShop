package com.wix.barbershop.Products.Admin.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class AdminId extends CustomUUID {
    public AdminId(String value) {
        super(value);
    }
}
