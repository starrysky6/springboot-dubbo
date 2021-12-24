package com.example.bean;

import java.io.Serializable;

/**
 * 地址数据模型，需要序列化
 */
public class Address implements Serializable {
    private String id;
    private String address;

    public Address(String personId, String address) {
        this.id = personId;
        this.address = address;
    }
    public Address() {
    }

    public String getPersonId() {
        return id;
    }

    public void setPersonId(String personId) {
        this.id = personId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonAddress{" +
                "personId='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
