package com.example.demo.user.controller;

import java.util.List;
import com.example.demo.user.model.User;
import com.example.demo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        log.info("Getting all user details");
        return userService.findAllUser();
    }

    @PostMapping("")
    public User create(@RequestBody User user) {
        log.info("Getting all user details");
        return userService.createUser(user);
    }
}
