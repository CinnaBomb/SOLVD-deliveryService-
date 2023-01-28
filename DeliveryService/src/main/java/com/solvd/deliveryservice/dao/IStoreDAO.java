package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface IStoreDAO<T> extends IBaseDAO {
    List<T> getAllStores();
}
