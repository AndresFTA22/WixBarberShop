package com.wix.barbershop.Services.Date.Domain;

import com.wix.barbershop.Services.Date.Domain.ValueObjects.DateDate;
import com.wix.barbershop.Services.Date.Domain.ValueObjects.DateId;
import com.wix.barbershop.Services.Service.Domain.ValueObjects.ServiceId;
import com.wix.barbershop.Services.TypeService.Domain.TypeService;
import com.wix.barbershop.Users.User.Domain.ValueObjects.UserId;

import java.util.HashMap;

public class Date {
    private DateId dateId;
    private UserId userId;
    private UserId barberoid;
    private TypeService typeService;
    private ServiceId serviceId;
    private DateDate dateDate;

    public Date(DateId dateId, UserId userId, UserId barberoid, TypeService typeService, ServiceId serviceId, DateDate dateDate) {
        this.dateId = dateId;
        this.userId = userId;
        this.barberoid = barberoid;
        this.typeService = typeService;
        this.serviceId = serviceId;
        this.dateDate = dateDate;
    }
    public static Date create(){
        return  null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",dateId.value());
                put("userId",userId.value());
                put("barberoId",barberoid.value());
                put("type",typeService);
                put("serviceId",serviceId.value());
                put("date",dateDate.value());
            }

        };
        return data;
    }
}
