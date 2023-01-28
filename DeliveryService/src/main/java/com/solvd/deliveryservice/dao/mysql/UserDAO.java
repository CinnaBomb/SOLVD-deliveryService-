package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.User;

public class UserDAO {

    private static final UserDAO INSTANCE = new UserDAO();

    private UserDAO() {}

    public static UserDAO getInstance() {
        return INSTANCE;
    }

    public void insertUser(User user) {
        // code to insert user object into the database
    }

    public User getUser(int userId) {
        // code to retrieve user from the database based on user id
        return null;
    }

    public void updateUser(User user) {
        // code to update user in the database
    }

    public void deleteUser(int userId) {
        // code to delete user from the database based on user id
    }
}
