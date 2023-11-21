package com.example.radare.models;

public class Message {
    private String date;
    private String message;
    private String house;

    public Message(String date, String message, String house) {
        this.date = date;
        this.message = message;
        this.house = house;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
