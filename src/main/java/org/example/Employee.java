package org.example;

//Bean or Model or POJO (Plain Old Java Object)
public class Employee {
    //Attributes
    int eId;
    String eName;
    Address eAddress;

    public Employee() {
    }

    //Constructor Injection
    public Employee(Address eAddress) {
        this.eAddress = eAddress;
    }

    //Setter Injection
    public void seteAddress(Address eAddress) {
        this.eAddress = eAddress;
    }

    //setters and getters
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Address geteAddress() {
        return eAddress;
    }
}
