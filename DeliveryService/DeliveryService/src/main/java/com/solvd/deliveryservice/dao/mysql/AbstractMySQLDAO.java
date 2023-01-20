package com.solvd.deliveryservice.dao.mysql;

import java.sql.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class AbstractMySQLDAO<T> {
    Logger logger = Logger.getLogger(AbstractMySQLDAO.class.getName());
    private Connection connection;
    public AbstractMySQLDAO(String url, String username, String password) throws SQLException {
        this.setConnection(DriverManager.getConnection(url, username, password));
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT VERSION()");
            if (rs.next()) {
                logger.info("Connection established: " + rs.getString(1));
            }
        } catch (SQLException e) {
                logger.info("Connection failed: " + e.getMessage());
            }
        }

    private void setConnection(Connection connection) {
    }

    public T getEntityById(long id) throws SQLException, InterruptedException {
        return null;
    }

    public void updateEntity(T entity) {
    }

    public T createEntity(T entity) {
            return entity;
    }

    public void removeEntity(long id) {
    }

}
