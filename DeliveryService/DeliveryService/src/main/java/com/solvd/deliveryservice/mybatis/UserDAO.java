package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.models.User;

import java.util.List;

public interface UserDAO {

    @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User getUserById(int id);

    @Insert("INSERT INTO users (column1, column2, ...) " +
            "VALUES (#{field1}, #{field2}, ...)")
    int insertUser(User user);

    @Update("UPDATE users SET column1 = #{field1}, column2 = #{field2}, ... " +
            "WHERE id = #{id}")
    int updateUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    int deleteUser(int id);
}

