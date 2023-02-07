package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.models.Item;

import java.util.List;

public interface ItemDAO {

    @Select("SELECT * FROM items")
    List<Item> getAllItems();

    @Select("SELECT * FROM items WHERE id = #{id}")
    Item getItemById(int id);

    @Insert("INSERT INTO items (column1, column2, ...) " +
            "VALUES (#{field1}, #{field2}, ...)")
    int insertItem(Item item);

    @Update("UPDATE items SET column1 = #{field1}, column2 = #{field2}, ... " +
            "WHERE id = #{id}")
    int updateItem(Item item);

    @Delete("DELETE FROM items WHERE id = #{id}")
    int deleteItem(int id);
}

