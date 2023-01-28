package com.solvd.deliveryservice.dao.mysql;

import com.solvd.deliveryservice.models.License;

public class LicenseDAO {

    private static final LicenseDAO INSTANCE = new LicenseDAO();

    private LicenseDAO() {}

    public static LicenseDAO getInstance() {
        return INSTANCE;
    }

    public void insertLicense(License license) {
        // code to insert license object into the database
    }

    public License getLicense(String licenseNumber) {
        // code to retrieve license from the database based on license number
        return null;
    }

    public void updateLicense(License license) {
        // code to update license in the database
    }

    public void deleteLicense(String licenseNumber) {
        // code to delete license from the database based on license number
    }
}
