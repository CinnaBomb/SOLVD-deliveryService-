package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeliveryServiceDAO<DeliveryService> {
    private ConnectionPool pool;

    public DeliveryServiceDAO(ConnectionPool pool) {
        this.pool = pool;
    }

    public List<DeliveryService> getAllDeliveryServices() throws SQLException, InterruptedException {
        List<DeliveryService> deliveryServices = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = (Connection) pool.getConnection();
            String query = "SELECT * FROM DELIVERYSERVICE_COMPANY";
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String address = rs.getString("ADRESS");
                String name = rs.getString("NAME");
                int idAPP = rs.getInt("idAPP");
            }
        } finally {
            pool.putConnection(conn);
            if (stmt != null) stmt.close();
            if (rs != null) rs.close();
        }

        return deliveryServices;
    }

    public DeliveryService getDeliveryServiceById(int id) throws SQLException, InterruptedException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = (Connection) pool.getConnection();
            String query = "SELECT * FROM DELIVERYSERVICE_COMPANY WHERE id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

        } finally {

        }
        return null;
    }
}

