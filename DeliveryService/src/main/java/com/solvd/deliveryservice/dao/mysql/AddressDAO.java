package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Address;

public class AddressDAO {

    private static final AddressDAO INSTANCE = new AddressDAO();

    private AddressDAO() {}

    public static AddressDAO getInstance() {
        return INSTANCE;
    }

    public void insertAddress(Address address) {
        // code to insert address object into the database
    }

    public Address getAddress(int addressId) {
        // code to retrieve address from the database based on address id
        return null;
    }

    public void updateAddress(Address address) {
        // code to update address in the database
    }

    public void deleteAddress(int addressId) {
        // code to delete address from the database based on address id
    }
}
