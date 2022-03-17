package com.wix.barbershop.Users.Address.Domain;

import com.wix.barbershop.Users.Address.Domain.ValueObjects.*;

import java.util.HashMap;

public class Address {
    private AddressId addressId;
    private AddressDetail addressDetail;
    private AddressCity addressCity;
    private AddressAdditionalInfo addressAdditionalInfo;
    private AddressNeighborhodd addressNeighborhodd;

    public Address(AddressId addressId, AddressDetail addressDetail, AddressCity addressCity, AddressAdditionalInfo addressAdditionalInfo, AddressNeighborhodd addressNeighborhodd) {
        this.addressId = addressId;
        this.addressDetail = addressDetail;
        this.addressCity = addressCity;
        this.addressAdditionalInfo = addressAdditionalInfo;
        this.addressNeighborhodd = addressNeighborhodd;
    }
    public static Address create(){
        return null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
               put("id",addressId.value());
               put("details",addressDetail.value());
               put("additional info",addressAdditionalInfo.value());
               put("city",addressCity.value());
               put("neighborhood",addressNeighborhodd.value());
            }

        };
        return data;
    }
}
