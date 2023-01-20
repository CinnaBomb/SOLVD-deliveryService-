package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IDeliveryServiceDAO<T> {
    List<T> getAllDeliveryServices();
}
