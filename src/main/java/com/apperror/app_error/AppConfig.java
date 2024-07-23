package com.apperror.app_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apperror.app_error.domain.entity.User;

@Configuration
public class AppConfig {
 
    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Andres", "Mena"));
        users.add(new User(3L, "Maria", "Perez"));
        users.add(new User(4L, "Jose", "Ramirez"));
        users.add(new User(5L, "Ale", "Gutierrez"));
        return users;
    }
}
