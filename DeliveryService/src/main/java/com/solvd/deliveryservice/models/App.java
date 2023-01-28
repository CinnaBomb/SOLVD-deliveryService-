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

    public App(int id, String name, String category, double rating) {
    }

    public int getId() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public void setId(int id) {
    }

    public String getCategory() {
        return null;
    }

    public double getRating() {
        return 0;
    }
}
