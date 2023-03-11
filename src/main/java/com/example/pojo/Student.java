package com.example.pojo;

public class Student {
    private long id;
    private String username;
    private long number;
    private int gender;

    public Student() {
    }

    public Student(long id, String username, long number, int gender) {
        this.id = id;
        this.username = username;
        this.number = number;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
