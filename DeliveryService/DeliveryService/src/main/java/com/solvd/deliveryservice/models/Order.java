package com.solvd.deliveryservice.models;

import java.util.List;

public class Order {
    private int avgOrders;
    private int price;

    private List<Order> orders;

    public Order(int avgOrders, int price) {
        this.avgOrders = avgOrders;
        this.price = price;
    }

    public Order() {

    }

    public int getAvgOrders() {
        return avgOrders;
    }

    public void setAvgOrders(int avgOrders) {
        this.avgOrders = avgOrders;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
    }

    public void setUserId(int userId) {
    }

    public void setAddressId(int addressId) {
    }
}
