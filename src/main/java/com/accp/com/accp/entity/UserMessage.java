package com.accp.com.accp.entity;

public class UserMessage {
    private int error;
    private String message;

    public UserMessage() {
    }

    public UserMessage(int error, String message) {
        this.error = error;
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
