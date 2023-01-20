package com.solvd.deliveryservice.user;

public class UserCars {
    private int amount;
    private String owner;

    public UserCars(int amount, String owner) {
        this.amount = amount;
        this.owner = owner;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
