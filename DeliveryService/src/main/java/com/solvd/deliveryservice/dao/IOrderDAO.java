package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IOrderDAO<T> {
    List<T> getAllOrders();
}
