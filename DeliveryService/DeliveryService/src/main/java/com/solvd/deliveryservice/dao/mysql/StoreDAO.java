package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.store.Store;
import com.solvd.deliveryservice.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StoreDAO {
    private ConnectionPool pool;

    public StoreDAO(ConnectionPool pool) {
        this.pool = pool;
    }

    public List<Store> getAllStores() throws SQLException, InterruptedException {
        List<Store> stores = new ArrayList<>();
        Connection conn = null;
        try {
            conn = (Connection) pool.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Store");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Store store = new Store();
                store.setId(rs.getInt("id"));
                store.setName(rs.getString("name"));
                store.setLocation(rs.getString("location"));
                stores.add(store);
            }
        } finally {
            if (conn != null) {
                pool.returnConnection(conn);
            }
        }
        return stores;
    }

    public Store getStoreById(int id) throws SQLException, InterruptedException {
        Store store = new Store();
        Connection conn = null;
        try {
            conn = (Connection) pool.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Store WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                store.setId(rs.getInt("id"));
                store.setName(rs.getString("name"));
                store.setLocation(rs.getString("location"));
            }
        } finally {
            if (conn != null) {
                pool.returnConnection(conn);
            }
        }
        return store;
    }

    public void addStore(Store store) throws SQLException {
        Connection conn = null;
        try {
            conn = (Connection) pool.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Store (name, location) VALUES (?, ?)");
            stmt.setString(1, store.getName());
            stmt.setString(2, store.getLocation());
            stmt.executeUpdate();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                pool.returnConnection
            }
        }
    }
}
