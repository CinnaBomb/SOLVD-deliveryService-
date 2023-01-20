package com.solvd.deliveryservice.store;

public class StoreOrder {
    private int amount;
    private int rating;

    public StoreOrder(int amount, int rating) {
        this.amount = amount;
        this.rating = rating;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
