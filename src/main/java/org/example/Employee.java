package org.example;

//Bean or Model or POJO (Plain Old Java Object)
public class Employee {
    //Attributes
    int eId;
    String eName;
    String eAddress;

    public Employee() {

    }
    public Employee(int eId, String eName, String eAddress) {
        this.eId = eId;
        this.eName = eName;
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

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eAddress='" + eAddress + '\'' +
                '}';
    }
}
