package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface IUserDAO<T> extends IBaseDAO {
    List<T> getAllUsers();
}
