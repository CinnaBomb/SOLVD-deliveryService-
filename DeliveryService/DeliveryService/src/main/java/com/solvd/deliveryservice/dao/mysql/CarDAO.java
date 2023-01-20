package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.car.Car;
import com.solvd.deliveryservice.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDAO {

    private ConnectionPool pool;

    public CarDAO(ConnectionPool pool) {
        this.pool = pool;
    }

    public void addCar(Car car) throws SQLException, InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO CAR (MAKE, MODEL) VALUES (?, ?)"
            );
            statement.setString(1, car.getMake());
            statement.setString(2, car.getModel());
            statement.executeUpdate();
        } finally {
            pool.putConnection(connection);
        }
    }

    public Car getCarById(int id) throws SQLException, InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM CAR WHERE id = ?"
            );
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Car(
                        resultSet.getInt("id"),
                        resultSet.getString("MAKE"),
                        resultSet.getString("MODEL")
                );
            }
            return null;
        } finally {
            pool.putConnection(connection);
        }
    }

    public void updateCar(Car car) throws SQLException, InterruptedException {
        Connection connection = (Connection) pool.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE CAR SET MAKE = ?, MODEL = ? WHERE id = ?"
            );
            statement.setString(1, car.getMake());
            statement.setString(2, car.getModel());
            statement.setInt(3, car.getId());
            statement.executeUpdate();
        } finally {

        }
    }
}

