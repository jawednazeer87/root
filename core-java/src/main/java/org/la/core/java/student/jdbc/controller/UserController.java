package org.la.core.java.student.jdbc.controller;

import org.la.core.java.student.jdbc.model.User;
import org.la.core.java.student.jdbc.service.UserService;

import java.util.Calendar;
import java.util.List;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserService();
        try {
            //userService.create("amit@mail.com", "amit", 37);
            //userService.delete(4);
            List<User> userList = userService.findAll();

            //User user = userService.findById(1);
            //System.out.println(user);
            //userList = userService.findByAge(150);
            //userList.forEach(System.out::println);
            Calendar calendar = Calendar.getInstance();
            calendar.set(2010, 00, 01, 0, 0);
            //userList = userService.findByDob(calendar);
            userList.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
