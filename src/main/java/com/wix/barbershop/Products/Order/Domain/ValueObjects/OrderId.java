package com.wix.barbershop.Products.Order.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class OrderId extends CustomUUID {
    public OrderId(String value) {
        super(value);
    }
}
