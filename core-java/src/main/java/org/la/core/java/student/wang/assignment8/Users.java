package org.la.core.java.student.wang.assignment8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Users {
    /*
    12.	Create a class Users having member variables id, fullName, email, gender, dateOfBirth, countryCode, createdAt. create getters and setters for all member variables. Create object of Users class in other class inside main method and set all member values and print all member values using getters.
     */
    private int id,countryCode;
    private String fullName, email, gender;
    private LocalDate dateOfBirth;
    private LocalDateTime createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
