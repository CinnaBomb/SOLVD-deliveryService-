package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.order.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class OrderDAO {
    private DataSource dataSource;

    public OrderDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Order getOrder(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Order order = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM orders WHERE id = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                order = new Order();
                order.setId(rs.getInt("id"));
                order.setPrice((int) rs.getDouble("price"));
                order.setAvgOrders(rs.getInt("avgOrders"));
                order.setUserId(rs.getInt("userId"));
                order.setAddressId(rs.getInt("addressId"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                //connection is returned to the pool here
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return order;
    }
}

