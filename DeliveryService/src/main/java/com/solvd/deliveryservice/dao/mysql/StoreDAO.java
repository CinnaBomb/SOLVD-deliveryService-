package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Store;

public class StoreDAO {

    private static final StoreDAO INSTANCE = new StoreDAO();

    private StoreDAO() {}

    public static StoreDAO getInstance() {
        return INSTANCE;
    }

    public void insertStore(Store store) {
        // code to insert store object into the database
    }

    public Store getStore(int storeId) {
        // code to retrieve store from the database based on store id
        return null;
    }

    public void updateStore(Store store) {
        // code to update store in the database
    }

    public void deleteStore(int storeId) {
        // code to delete store from the database based on store id
    }
}
