package com.solvd.deliveryservice.models;

import java.util.List;

public class DeliveryService {
    private String name;
    private String location;
    private List<String> deliveryTypes;

    public DeliveryService(String name, String location, List<String> deliveryTypes) {
        this.name = name;
        this.location = location;
        this.deliveryTypes = deliveryTypes;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getDeliveryTypes() {
        return deliveryTypes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDeliveryTypes(List<String> deliveryTypes) {
        this.deliveryTypes = deliveryTypes;
    }
}
