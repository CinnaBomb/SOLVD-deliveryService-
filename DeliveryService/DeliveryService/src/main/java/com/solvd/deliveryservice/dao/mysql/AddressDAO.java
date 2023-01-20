package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.address.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class AddressDAO {

    private DataSource dataSource;

    public AddressDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addAddress(Address address) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(
                    "INSERT INTO ADDRESS (POINTFROM, POINTTO) VALUES (?, ?)");
            statement.setString(1, address.getPointFrom());
            statement.setString(2, address.getPointTo());
            statement.executeUpdate();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public List<Address> getAllAddresses() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(
                    "SELECT * FROM ADDRESS");
            resultSet = statement.executeQuery();

            List<Address> addresses = new ArrayList<Address>();
            while (resultSet.next()) {
                Address address = new Address();
                address.setId(resultSet.getInt("id"));
                address.setPointFrom(resultSet.getString("POINTFROM"));
                address.setPointTo(resultSet.getString("POINTTO"));
                addresses.add(address);
            }
            return addresses;
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}

