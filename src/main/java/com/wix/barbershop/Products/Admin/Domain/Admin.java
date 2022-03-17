package com.wix.barbershop.Products.Admin.Domain;

import com.wix.barbershop.Products.Admin.Domain.ValueObjects.AdminId;
import com.wix.barbershop.Products.Admin.Domain.ValueObjects.AdminName;
import com.wix.barbershop.Products.Admin.Domain.ValueObjects.AdminPassword;

import java.util.HashMap;

public class Admin {
    private AdminId adminId;
    private AdminName adminName;
    private AdminPassword adminPassword;

    public Admin(AdminId adminId, AdminName adminName, AdminPassword adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public static Admin create(){
        return null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",adminId.value());
                put("name",adminName.value());
            }

        };
        return data;
    }
}
