package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IStoreDAO<T> {
    List<T> getAllStores();
}
