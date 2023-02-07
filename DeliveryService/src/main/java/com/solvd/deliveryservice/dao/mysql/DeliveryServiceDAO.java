package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.DeliveryService;

public class DeliveryServiceDAO {

    private static final DeliveryServiceDAO INSTANCE = new DeliveryServiceDAO();

    private DeliveryServiceDAO() {}

    public static DeliveryServiceDAO getInstance() {
        return INSTANCE;
    }

    public void insertDeliveryService(DeliveryService deliveryService) {
        // code to insert deliveryService object into the database
    }

    public DeliveryService getDeliveryService(int deliveryServiceId) {
        // code to retrieve deliveryService from the database based on deliveryService id
        return null;
    }

    public void updateDeliveryService(DeliveryService deliveryService) {
        // code to update deliveryService in the database
    }

    public void deleteDeliveryService(int deliveryServiceId) {
        // code to delete deliveryService from the database based on deliveryService id
    }
}
