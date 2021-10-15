package org.la.core.java.student.barry.jdbc.model;

import java.util.List;

import org.la.core.java.student.jdbc.model.Address;

public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private List<Address> addressList;

    public User(){}
    public User(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public User(int id, String name, String email, int age, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.addressList = addressList;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Address> getAddressList() {
        return addressList;
    }
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", addressList=" + addressList +
                '}';
    }

}
