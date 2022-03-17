package com.wix.barbershop.Users.Phone.Domain;

import com.wix.barbershop.Users.Phone.Domain.ValueObjects.PhoneCountryCode;
import com.wix.barbershop.Users.Phone.Domain.ValueObjects.PhoneId;
import com.wix.barbershop.Users.Phone.Domain.ValueObjects.PhoneNumber;

import java.util.HashMap;

public class Phone {
    private PhoneId phoneid;
    private PhoneNumber phonenumber;
    private PhoneCountryCode phoneCountryCode;

    public Phone(PhoneId phoneid, PhoneNumber phonenumber, PhoneCountryCode phoneCountryCode) {
        this.phoneid = phoneid;
        this.phonenumber = phonenumber;
        this.phoneCountryCode = phoneCountryCode;
    }
    public static Phone create(){
        return null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",phoneid.value());
                put("number",phonenumber.value());
                put("country code",phoneCountryCode.value());
            }

        };
        return data;
    }
}
