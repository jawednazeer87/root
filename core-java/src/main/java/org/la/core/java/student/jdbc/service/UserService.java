package org.la.core.java.student.jdbc.service;

import org.la.core.java.student.jdbc.model.User;
import org.la.core.java.student.jdbc.respository.UserRepository;
import org.la.core.java.student.jdbc.util.DateUtil;

import java.util.Calendar;
import java.util.List;

public class UserService {

    public List<User> findByDob(Calendar calendar) throws Exception {
        int years = DateUtil.findAgeByDOB(calendar);
        return UserRepository.findByAge(years);
    }

    public List<User> findByAge(int age) throws Exception {
        return UserRepository.findByAge(age);
    }

    public User findById(int id)  throws Exception {
        return UserRepository.findById(id);
    }

    public void delete(int id)  throws Exception {
        UserRepository.delete(id);
    }

    public List<User> findAll()  throws Exception{
        return UserRepository.findAll();
    }

    public void create(String email, String name, int age)  throws Exception {
        UserRepository.create(email, name, age);
    }
}
