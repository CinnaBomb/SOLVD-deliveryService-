package com.solvd.deliveryservice.services;

import dao.IBaseDAO;

import java.sql.SQLException;

public class ObjectService {
    private IBaseDAO<Object> objectDAO;

    ObjectService(IBaseDAO<Object> objectDAO) {
        this.objectDAO = objectDAO;
    }

    public Object getObjectById(long id) throws SQLException, InterruptedException {
        return objectDAO.getEntityById(id);
    }

    public void updateObject(Object object) {
        objectDAO.updateEntity(object);
    }

    public Object createObject(Object object) {
        return objectDAO.createEntity(object);
    }

    public void removeObject(long id) {
        objectDAO.removeEntity(id);
    }
}
