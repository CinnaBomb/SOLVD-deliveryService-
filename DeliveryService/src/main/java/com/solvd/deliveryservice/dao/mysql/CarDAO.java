package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.Car;

public class CarDAO {

    private static final CarDAO INSTANCE = new CarDAO();

    private CarDAO() {}

    public static CarDAO getInstance() {
        return INSTANCE;
    }

    public void insertCar(Car car) {
        // code to insert car object into the database
    }

    public Car getCar(int carId) {
        // code to retrieve car from the database based on car id
        return null;
    }

    public void updateCar(Car car) {
        // code to update car in the database
    }

    public void deleteCar(int carId) {
        // code to delete car from the database based on car id
    }
}


