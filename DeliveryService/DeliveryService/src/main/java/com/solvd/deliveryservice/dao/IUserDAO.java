package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IUserDAO<T> {
    List<T> getAllUsers();
}
