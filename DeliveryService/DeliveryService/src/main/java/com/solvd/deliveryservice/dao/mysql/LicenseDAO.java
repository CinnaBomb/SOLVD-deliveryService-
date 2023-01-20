package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.utils.ConnectionPool;
import com.solvd.deliveryservice.liscense.Liscense;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class LicenseDAO<License> {
    private ConnectionPool pool;

    private List<License> liscenses;

    public LicenseDAO(ConnectionPool pool) {
        this.pool = pool;
    }

    public void insertLicense(License license) throws InterruptedException {
        Connection conn = (Connection) pool.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO License (id, license_number, expiration_date) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Liscense.getId());
            ps.setString(2, Liscense.getLicenseNumber());
            ps.setDate(3, Liscense.getExpirationDate());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Return the connection to the pool
            pool.returnConnection(conn);
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public License getLicenseById(int id) {
        return null;
    }
}

