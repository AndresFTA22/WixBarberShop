package com.wix.barbershop.Services.Service.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.DoubleValueObject;

public class ServicePrice extends DoubleValueObject {
    public ServicePrice(double value) {
        validate(value);
        this.value = value;
    }
    public void validate(double value){

    }
}
