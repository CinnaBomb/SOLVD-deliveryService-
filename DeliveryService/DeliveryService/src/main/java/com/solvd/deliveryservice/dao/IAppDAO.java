package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface IAppDAO<T> extends IBaseDAO {
    List<T> getAllApps();
}
