package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.item.Item;
import com.solvd.deliveryservice.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemDAO {
    private ConnectionPool pool;

    public ItemDAO(ConnectionPool pool) {
        this.pool = pool;
    }

    public void create(Item item) throws SQLException, InterruptedException {
        Connection conn = (Connection) pool.getConnection();
        try {
            String sql = "INSERT INTO ITEM (ITEMNAME, PRICE, idSTORE, idSTOREORDER) VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, item.getItemName());
            stmt.setInt(2, item.getPrice());
            stmt.setInt(3, item.getIdStore());
            stmt.setInt(4, item.getIdStoreOrder());
            stmt.executeUpdate();
        } finally {
            pool.putConnection(conn);
        }
    }

    public Item read(int id) throws SQLException, InterruptedException {
        Connection conn = (Connection) pool.getConnection();
        try {
            String sql = "SELECT * FROM ITEM WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setItemName(rs.getString("ITEMNAME"));
            }
        } finally {

        }
        return null;
    }
}

