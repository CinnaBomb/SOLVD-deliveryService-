package com.solvd.deliveryservice.models;

import java.util.List;

public class Item {
    private String itemName;
    private int price;

    private List<Item> items;

    public Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public Item() {

    }

    public Item(String name, String description, double price) {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
    }

    public int getIdStore() {
        return 0;
    }

    public int getIdStoreOrder() {
        return 0;
    }

    public String getItemDescription() {
        return null;
    }
}
