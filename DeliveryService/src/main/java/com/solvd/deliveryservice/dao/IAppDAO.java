package com.solvd.deliveryservice.dao;

import java.util.List;

public interface IAppDAO<T> {
    List<T> getAllApps();
}
