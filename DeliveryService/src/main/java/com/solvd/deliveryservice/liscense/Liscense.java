package com.solvd.deliveryservice.liscense;

import java.sql.Date;

public class Liscense {
    private int number;
    private int expirationDate;
    private String state;

    public Liscense(int number, int expirationDate, String state) {
        this.expirationDate = expirationDate;
        this.number = number;
        this.state = state;
    }

    public static int getId() {
        return 0;
    }

    public static String getLicenseNumber() {
        return null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
