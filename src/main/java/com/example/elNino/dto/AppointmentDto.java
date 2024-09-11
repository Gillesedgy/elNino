package com.example.elNino.dto;

public class AppointmentDto {
    private int id;
    private int userId;
    private String title;
    private String description;
    private String date;
    private String time;


    public AppointmentDto() {}
    public AppointmentDto(int id, int userId, String title, String description, String date, String time) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
