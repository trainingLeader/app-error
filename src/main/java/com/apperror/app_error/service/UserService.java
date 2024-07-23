package com.apperror.app_error.service;

import java.util.List;
import java.util.Optional;

import com.apperror.app_error.domain.entity.User;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
}
