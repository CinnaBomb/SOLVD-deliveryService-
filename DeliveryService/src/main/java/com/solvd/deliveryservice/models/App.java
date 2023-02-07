package com.solvd.deliveryservice.models;

public class App {
    private String rating;
    private int activeOrders;
    private int drivers;

    public App(String rating, int activeOrders, int drivers) {
        this.activeOrders = activeOrders;
        this.drivers = drivers;
        this.rating = rating;
    }

    public App() {

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getActiveOrders() {
        return activeOrders;
    }

    public void setActiveOrders(int activeOrders) {
        this.activeOrders = activeOrders;
    }

    public int getDrivers() {
        return drivers;
    }

    public void setDrivers(int drivers) {
        this.drivers = drivers;
    }
}
