package com.solvd.deliveryservice.mybatis;

import java.util.List;
import com.solvd.deliveryservice.models.Order;

public interface OrderDAO {

    @Select("SELECT * FROM orders")
    List<Order> getAllOrders();

    @Select("SELECT * FROM orders WHERE id = #{id}")
    Order getOrderById(int id);

    @Insert("INSERT INTO orders (column1, column2, ...) " +
            "VALUES (#{field1}, #{field2}, ...)")
    int insertOrder(Order order);

    @Update("UPDATE orders SET column1 = #{field1}, column2 = #{field2}, ... " +
            "WHERE id = #{id}")
    int updateOrder(Order order);

    @Delete("DELETE FROM orders WHERE id = #{id}")
    int deleteOrder(int id);
}
