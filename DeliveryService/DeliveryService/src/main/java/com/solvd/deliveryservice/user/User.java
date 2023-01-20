package com.solvd.deliveryservice.user;

import java.util.List;

public class User {
    private String fname;
    private String lname;
    private int age;

    private List<User> users;

    public User(String fname, String lname, int age) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public User() {

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
    }
}
