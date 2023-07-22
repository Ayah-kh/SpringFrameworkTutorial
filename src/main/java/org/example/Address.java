package org.example;

public class Address {
//Attributes
    private String city;
    private String state;
    private int zipCode;

    public Address() {
    }

    public Address(String city, String state, int zipCode) {
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //Setter and getters


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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
