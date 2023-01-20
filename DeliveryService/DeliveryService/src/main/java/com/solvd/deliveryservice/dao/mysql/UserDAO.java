package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.user.User;
import com.solvd.deliveryservice.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private ConnectionPool pool;

    public UserDAO(ConnectionPool pool) {
        this.pool = pool;
    }

    public User getUser(int id) throws InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM USER WHERE id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFname(rs.getString("fname"));
                user.setLname(rs.getString("lname"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            pool.returnConnection(connection);
        }
        return null;
    }

    public void addUser(User user) throws InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO USER (fname, lname) VALUES (?, ?)");
            statement.setString(1, user.getFname());
            statement.setString(2, user.getLname());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            pool.returnConnection(connection);
        }
    }
}
