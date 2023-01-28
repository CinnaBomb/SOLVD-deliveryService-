package com.solvd.deliveryservice.dao.MyBetisDao;

import com.solvd.deliveryservice.dao.mysql.OrderDAO;
import com.solvd.deliveryservice.models.Order;
import java.util.List;

public interface OrderDao {
    public List<Order> getOrders();
    public Order getOrderById(int id);
    public void insertOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrder(int id);
}
