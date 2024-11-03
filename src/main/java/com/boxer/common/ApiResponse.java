package com.boxer.common;

public class ApiResponse<T> {
    private String code;       // 响应码
    private String message;    // 响应消息
    private T data;            // 响应数据
    private long timestamp;     // 响应时间戳



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
