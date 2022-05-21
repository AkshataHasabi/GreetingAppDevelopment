package com.example.springbootexample.model;

public class User {
    public String getfName() {
        return fName;
    }

    public User() {
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public User(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    private String fName;
    private String lName;
}
