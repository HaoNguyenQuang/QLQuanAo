package com.example.quanlybanquanao.enums;

import com.example.quanlybanquanao.dto.CodeName;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum UserPermission {
    ALL ("All permissions"),
    ROLE_MANAGER ("Role Manager"),
    CATEGORY_MANAGER ("Category Manager"),
    COLOR_MANAGER ("Color Manager"),
    PERMISSION_MANAGER ("Permission Manager"),
    PRODUCT_DETAILS_MANAGER ("Product Details Manager"),
    PRODUCT_MANAGER ("Product Manager"),
    PURCHASE_INVOICE_MANAGER ("Purchase Invoice Manager"),
    SALES_INVOICE_MANAGER ("Sales Invoice Manager"),
    SIZE_MANAGER ("Size Manager"),
    USER_MANAGER ("User Manager"),
    VOUCHER_MANAGER ("Voucher Manager");

    private final String description;

    UserPermission(String description) {
        this.description = description;
    }

    public static List<CodeName> getListCodeName() {
        List<CodeName> ret = new ArrayList<>();
        for (UserPermission item : values()) {
            ret.add(new CodeName(item.name(), item.getDescription()));
        }
        return ret;
    }
}
