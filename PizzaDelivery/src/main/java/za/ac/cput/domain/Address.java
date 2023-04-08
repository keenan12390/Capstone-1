package za.ac.cput.domain;

import java.util.Objects;

/*
Address.java
Address entity
Author: Tamryn Lisa Lewin (219211981)
Date: 04 April 2023
 */

public class Address {
    private String addressId;
    private String streetNumber;
    private String streetName;
    private String city;
    private String zipCode;
    private String province;
    private String country;

    private Address() {}

    private Address(Builder builder) {
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
        this.province = builder.province;
        this.country = builder.country;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public static class Builder {
        private String addressId;
        private String streetNumber;
        private String streetName;
        private String city;
        private String zipCode;
        private String province;
        private String country;

        public Builder setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder copy(Address address) {
            this.addressId = address.addressId;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.city = address.city;
            this.zipCode = address.zipCode;
            this.province = address.province;
            this.country = address.country;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return addressId.equals(address.addressId) && streetNumber.equals(address.streetNumber) && streetName.equals(address.streetName) && city.equals(address.city) && zipCode.equals(address.zipCode) && province.equals(address.province) && country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, streetNumber, streetName, city, zipCode, province, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
