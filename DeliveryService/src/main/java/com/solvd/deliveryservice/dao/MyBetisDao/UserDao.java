package com.solvd.deliveryservice.dao.MyBetisDao;


import com.solvd.deliveryservice.dao.mysql.UserDAO;
import com.solvd.deliveryservice.models.User;

import java.util.List;

public interface UserDao {
    public List<User> getUsers();
    public User getUserById(int id);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
}
