package com.example.quanlybanquanao.dto;

import lombok.Data;

@Data
public class CodeName {
    private String code;
    private String name;

    public CodeName() {
    }

    public CodeName(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
