package com.apperror.app_error.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.apperror.app_error.domain.entity.User;

public class UserServiceImpl implements UserService{

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter( usr -> usr.getId().equals(id) ).findFirst();
    }

}
