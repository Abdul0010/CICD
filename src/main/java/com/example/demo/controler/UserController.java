package com.example.demo.controler;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
@RequiredArgsConstructor
@RequestMapping("/User")
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    public void registerUser(@Validated @RequestBody User userRequest){

        userService.registerUser(userRequest);

    }


}
