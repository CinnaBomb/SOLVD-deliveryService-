package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface ILiscenseDAO<T> extends IBaseDAO {
    List<T> getAllLiscenses();
}
