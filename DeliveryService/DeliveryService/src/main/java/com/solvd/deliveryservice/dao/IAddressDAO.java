package com.solvd.deliveryservice.dao;

import dao.IBaseDAO;

import java.util.List;

public interface IAddressDAO<T> extends IBaseDAO {
    List<T> getAllAddresses();
}
