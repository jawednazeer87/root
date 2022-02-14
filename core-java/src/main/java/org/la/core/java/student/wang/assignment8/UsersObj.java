package org.la.core.java.student.wang.assignment8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsersObj {
    public static void main(String[] args) {
        Users users = new Users();
        users.setId(1);
        users.setFullName("Wong");
        users.setEmail("138942352@qq.com");
        users.setGender("Male");
        users.setDateOfBirth(LocalDate.of(1990,3,1));
        users.setCountryCode(1);
        users.setCreatedAt(LocalDateTime.of(2022,2,12,12,23));

        System.out.println("users.getId() = " + users.getId());
        System.out.println("users.getFullName() = " + users.getFullName());
        System.out.println("users.getEmail() = " + users.getEmail());
        System.out.println("users.getGender() = " + users.getGender());
        System.out.println("users.getDateOfBirth() = " + users.getDateOfBirth());
        System.out.println("users.getCountryCode() = " + users.getCountryCode());
        System.out.println("users.getCreatedAt() = " + users.getCreatedAt());
    }
}
