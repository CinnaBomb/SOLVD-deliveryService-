package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Item;

public class ItemDAO {

    private static final ItemDAO INSTANCE = new ItemDAO();

    private ItemDAO() {}

    public static ItemDAO getInstance() {
        return INSTANCE;
    }

    public void insertItem(Item item) {
        // code to insert item object into the database
    }

    public Item getItem(int itemId) {
        // code to retrieve item from the database based on item id
        return null;
    }

    public void updateItem(Item item) {
        // code to update item in the database
    }

    public void deleteItem(int itemId) {
        // code to delete item from the database based on item id
    }
}
