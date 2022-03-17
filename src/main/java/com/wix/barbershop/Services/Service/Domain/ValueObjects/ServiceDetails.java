package com.wix.barbershop.Services.Service.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class ServiceDetails extends StringValueObject {
    public ServiceDetails(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
