package com.solvd.deliveryservice.dao.MyBetisDao;

import com.solvd.deliveryservice.dao.mysql.StoreDAO;
import com.solvd.deliveryservice.models.Store;

import java.util.List;

public interface StoreDao {
    public List<Store> getStores();
    public Store getStoreById(int id);
    public void insertStore(Store store);
    public void updateStore(Store store);
    public void deleteStore(int id);
}
