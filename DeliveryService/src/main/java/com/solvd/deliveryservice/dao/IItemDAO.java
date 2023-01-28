package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface IItemDAO<T> extends IBaseDAO {
    List<T> getAllItems();
}
