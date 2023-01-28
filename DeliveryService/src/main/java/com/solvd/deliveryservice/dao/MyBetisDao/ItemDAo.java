package com.solvd.deliveryservice.dao.MyBetisDao;

import com.solvd.deliveryservice.dao.mysql.ItemDAO;
import com.solvd.deliveryservice.models.Item;

import java.util.List;

public interface ItemDAo {
    public List<Item> getItems();
    public Item getItemById(int id);
    public void insertItem(Item item);
    public void updateItem(Item item);
    public void deleteItem(int id);
}





