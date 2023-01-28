package com.solvd.deliveryservice.dao.MyBetisDao;

import com.solvd.deliveryservice.dao.mysql.CarDAO;
import com.solvd.deliveryservice.models.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCars();
    public Car getCarById(int id);
    public void insertCar(Car car);
    public void updateCar(Car car);
    public void deleteCar(int id);
}
