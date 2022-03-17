package com.wix.barbershop.Services.Service.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class ServiceId extends CustomUUID {
    public ServiceId(String value) {
        super(value);
    }
}
