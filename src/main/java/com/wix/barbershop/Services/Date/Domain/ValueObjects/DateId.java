package com.wix.barbershop.Services.Date.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class DateId extends CustomUUID {
    public DateId(String value) {
        super(value);
    }
}
