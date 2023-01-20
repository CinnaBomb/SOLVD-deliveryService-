package com.solvd.deliveryservice.address;

import java.util.List;

public class Address {
    private String pointTo;
    private String pointFrom;

    private List<Address> address;

    public Address(String pointFrom, String pointTo) {
        this.pointFrom = pointFrom;
        this.pointTo = pointTo;
    }

    public Address() {

    }

    public String getPointTo() {
        return pointTo;
    }

    public void setPointTo(String pointTo) {
        this.pointTo = pointTo;
    }

    public String getPointFrom() {
        return pointFrom;
    }

    public void setPointFrom(String pointFrom) {
        this.pointFrom = pointFrom;
    }

    public void setId(int id) {
    }

    public int getId() {
        return 0;
    }
}
