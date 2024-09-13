package com.example.quanlybanquanao.enums;

import lombok.Getter;

@Getter
public enum ErrorCode {
    SUCCESS ("Success"),
    OTHER ("%s"),
    INTERNAL_SERVER_ERROR ("Internal server error"),
    INVALID_CREDENTIAL ("Invalid username or password"),
    INVALID_PASSWORD ("Invalid password"),
    USER_LOCKED ("User has been locked"),
    INVALID_ACCESS_TOKEN ("Invalid access token"),
    SESSION_EXPIRED ("Session expired"),
    ACCESS_DENIED ("Access denied"),
    USERNAME_EXIST ("Username already exist"),
    RECORD_NOT_FOUND ("Record not found"),
    CREATE_FAILED ("Create failed"),
    UPDATE_FAILED ("Update failed"),
    DELETE_FAILED ("Delete failed"),
    VALUE_EXIST ("Value already exist"),
    INPUT_INVALID ("Input invalid"),
    PARSE_DATETIME_FAILED ("Parse datetime failed"),
    IMPORT_FAILED ("Import failed"),
    EXPORT_FAILED ("Export failed"),
    PHONE_NUMBER_EXIST ("Phone number already exist"),
    EXPORT_QUANTITY_INVALID ("Export quantity invalid");

    private final String msg;

    ErrorCode(String msg) {
        this.msg = msg;
    }

    public String format(String... args) {
        return String.format(msg, (Object) args);
    }

}
