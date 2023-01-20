package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.app.App;
import com.solvd.deliveryservice.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class AppDAO {
    private ConnectionPool pool;

    public AppDAO() throws SQLException, InterruptedException {
        pool = ConnectionPool.getInstance();
    }

    public void addApp(App app) throws InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO APP (id, name) VALUES (?, ?)");
            ps.setInt(1, app.getId());
            ps.setString(2, app.getName());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            pool.putConnection(connection);
        }
    }

    public App getApp(int id) throws InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM APP WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                App app = new App();
                app.setId(rs.getInt("id"));
                app.setName(rs.getString("name"));
                return app;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            pool.putConnection(connection);
        }
        return null;
    }

    public void updateApp(App app) throws InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "UPDATE APP SET name = ? WHERE id = ?");
            ps.setString(1, app.getName());
            ps.setInt(2, app.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            pool.putConnection(connection);
        }
    }

    public void deleteApp(int id) throws SQLException, InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "DELETE FROM APP WHERE id = ?");
        } finally {

        }
    }
}