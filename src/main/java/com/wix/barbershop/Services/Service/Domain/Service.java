package com.wix.barbershop.Services.Service.Domain;

import com.wix.barbershop.Services.Service.Domain.ValueObjects.ServiceDetails;
import com.wix.barbershop.Services.Service.Domain.ValueObjects.ServiceId;
import com.wix.barbershop.Services.Service.Domain.ValueObjects.ServicePrice;

import java.util.HashMap;

public class Service {
    private ServiceId serviceId;
    private ServicePrice servicePrice;
    private ServiceDetails serviceDetails;

    public Service(ServiceId serviceId, ServicePrice servicePrice, ServiceDetails serviceDetails) {
        this.serviceId = serviceId;
        this.servicePrice = servicePrice;
        this.serviceDetails = serviceDetails;
    }

    public static Service create(){
        return null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",serviceId.value());
                put("price",servicePrice.value());
                put("deltails",serviceDetails.value());
            }

        };
        return data;
    }
}
