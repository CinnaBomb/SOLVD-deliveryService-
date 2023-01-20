package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IAddressDAO<T> {
    List<T> getAllAddresses();
}
