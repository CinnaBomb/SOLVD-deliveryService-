package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.models.Store;

import java.util.List;

public interface StoreDAO {

    @Select("SELECT * FROM stores")
    List<Store> getAllStores();

    @Select("SELECT * FROM stores WHERE id = #{id}")
    Store getStoreById(int id);

    @Insert("INSERT INTO stores (column1, column2, ...) " +
            "VALUES (#{field1}, #{field2}, ...)")
    int insertStore(Store store);

    @Update("UPDATE stores SET column1 = #{field1}, column2 = #{field2}, ... " +
            "WHERE id = #{id}")
    int updateStore(Store store);

    @Delete("DELETE FROM stores WHERE id = #{id}")
    int deleteStore(int id);
}

