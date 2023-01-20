package com.solvd.deliveryservice.dao;

import java.util.List;

public interface ICarDAO<T> {
    List<T> getAllCars();
}
