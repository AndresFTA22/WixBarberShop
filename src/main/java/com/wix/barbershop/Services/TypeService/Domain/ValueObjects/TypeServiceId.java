package com.wix.barbershop.Services.TypeService.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class TypeServiceId extends CustomUUID {
    public TypeServiceId(String value) {
        super(value);
    }
}
