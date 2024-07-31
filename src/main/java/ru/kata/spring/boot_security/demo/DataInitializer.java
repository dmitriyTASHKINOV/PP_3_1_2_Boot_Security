package ru.kata.spring.boot_security.demo;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.service.UserService;


import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final UserService userService;


    public DataInitializer(UserService userService) {
        this.userService = userService;
    }

   @PostConstruct
    public void init() {
        userService.initializeDB();
    }
}