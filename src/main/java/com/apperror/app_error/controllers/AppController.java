package com.apperror.app_error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apperror.app_error.service.UserService;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private UserService service;

    @GetMapping
    public String index() {
        // int value = 100 / 0;
        int value = Integer.parseInt("20x");
        System.out.println(value);
        return "ok 200";
    }
}
