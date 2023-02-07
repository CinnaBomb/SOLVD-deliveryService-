package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.models.App;

import java.util.List;

public interface AppDAO {

    @Select("SELECT * FROM apps")
    List<App> getAllApps();

    @Select("SELECT * FROM apps WHERE id = #{id}")
    App getAppById(int id);

    @Insert("INSERT INTO apps (column1, column2, ...) " +
            "VALUES (#{field1}, #{field2}, ...)")
    int insertApp(App app);

    @Update("UPDATE apps SET column1 = #{field1}, column2 = #{field2}, ... " +
            "WHERE id = #{id}")
    int updateApp(App app);

    @Delete("DELETE FROM apps WHERE id = #{id}")
    int deleteApp(int id);
}

