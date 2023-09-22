package com.kartikvarma.entity;

import java.util.Objects;

public class Address {
    private int userId;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (userId != address.userId) return false;
        if (!Objects.equals(streetAddress, address.streetAddress))
            return false;
        if (!Objects.equals(city, address.city)) return false;
        if (!Objects.equals(state, address.state)) return false;
        return Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (streetAddress != null ? streetAddress.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "userId=" + userId +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
