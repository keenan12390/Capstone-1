package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.Helper;

/*
AddressFactory.java
Author: Tamryn Lisa Lewin (219211981)
Date: 04 April 2023
 */

public class AddressFactory {
    public static Address buildAddress(String streetNumber, String streetName, String city, String zipCode, String province, String country) {
        if(Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetName) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(zipCode) || Helper.isNullOrEmpty(province) || Helper.isNullOrEmpty(country)) {
            return null;
        }

        String addressId = Helper.generateId();

        Address address = new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setCity(city)
                .setZipCode(zipCode)
                .setProvince(province)
                .setCountry(country)
                .build();
        return address;
    }
}
