package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface ICarDAO<T> extends IBaseDAO {
    List<T> getAllCars();
}
