package com.dailycodebuffer.user_service.controller;


import com.dailycodebuffer.user_service.entity.UserValue;
import com.dailycodebuffer.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("saveUser/")
    public UserValue saveUser(@RequestBody UserValue userValue)
    {
        return userService.saveUser(userValue);
    }

    @GetMapping("/{id}")
     public UserValue getUserById(@PathVariable("id") Long userId)
     {
         return userService.getUserById(userId);
     }


}
