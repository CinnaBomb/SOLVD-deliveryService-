package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface IOrderDAO<T> extends IBaseDAO {
    List<T> getAllOrders();
}
