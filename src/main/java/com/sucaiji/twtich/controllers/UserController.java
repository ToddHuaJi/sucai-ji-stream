package com.sucaiji.twtich.controllers;

import com.sucaiji.twtich.bean.User;
import com.sucaiji.twtich.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Flux<User> getUsers(){
        return userService.getDummyUsers();
    }
}
