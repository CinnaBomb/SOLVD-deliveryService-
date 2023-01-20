package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IItemDAO<T> {
    List<T> getAllItems();
}
