package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.App;

public class AppDAO {

    private static final AppDAO INSTANCE = new AppDAO();

    private AppDAO() {}

    public static AppDAO getInstance() {
        return INSTANCE;
    }

    public void insertApp(App app) {
        // code to insert app object into the database
    }

    public App getApp(int appId) {
        // code to retrieve app from the database based on app id
        return null;
    }

    public void updateApp(App app) {
        // code to update app in the database
    }

    public void deleteApp(int appId) {
        // code to delete app from the database based on app id
    }
}
