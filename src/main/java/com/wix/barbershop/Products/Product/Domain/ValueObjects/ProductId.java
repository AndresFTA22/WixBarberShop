package com.wix.barbershop.Products.Product.Domain.ValueObjects;

import com.wix.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class ProductId extends CustomUUID {
    public ProductId(String value) {
        super(value);
    }
}
