package com.wix.barbershop.Services.TypeService.Domain;

import com.wix.barbershop.Services.TypeService.Domain.ValueObjects.TypeServiceId;
import com.wix.barbershop.Services.TypeService.Domain.ValueObjects.TypeServiceName;
import com.wix.barbershop.Users.Address.Domain.ValueObjects.AddressId;

import java.util.HashMap;

public class TypeService {
    private TypeServiceId typeServiceId;
    private TypeServiceName typeServiceName;
    private AddressId addressId;

    public TypeService(TypeServiceId typeServiceId, TypeServiceName typeServiceName, AddressId addressId) {
        this.typeServiceId = typeServiceId;
        this.typeServiceName = typeServiceName;
        this.addressId = addressId;
    }
    public static TypeService create(){
        return  null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",typeServiceId.value());
                put("name",typeServiceName.value());
                put("address",addressId.value());
            }

        };
        return data;
    }

}
