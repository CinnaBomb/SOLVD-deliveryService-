package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Order;

public class OrderDAO {

    private static final OrderDAO INSTANCE = new OrderDAO();

    private OrderDAO() {}

    public static OrderDAO getInstance() {
        return INSTANCE;
    }

    public void insertOrder(Order order) {
        // code to insert order object into the database
    }

    public Order getOrder(int orderId) {
        // code to retrieve order from the database based on order id
        return null;
    }

    public void updateOrder(Order order) {
        // code to update order in the database
    }

    public void deleteOrder(int orderId) {
        // code to delete order from the database based on order id
    }
}
