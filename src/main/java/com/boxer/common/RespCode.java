package com.boxer.common;

public enum RespCode {
    SUCCESS(200, "Operation successful"),
    SYSTEM_ERROR(500, "Internal server error"),
    VALIDATION_ERROR(400, "Data validation failed");

    private final int code; // HTTP 状态码
    private final String message; // 错误消息

    RespCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
