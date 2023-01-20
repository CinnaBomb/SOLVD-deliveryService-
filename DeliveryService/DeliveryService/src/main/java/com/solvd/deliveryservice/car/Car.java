package com.solvd.deliveryservice.car;

import java.util.List;

public class Car {
    private String make;
    private String model;

    private List<Car> car;

    public Car(int id, String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return 0;
    }
}
