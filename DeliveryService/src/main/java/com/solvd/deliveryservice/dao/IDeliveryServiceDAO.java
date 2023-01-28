package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface IDeliveryServiceDAO<T> extends IBaseDAO {
    List<T> getAllDeliveryServices();
}
