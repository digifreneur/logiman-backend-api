package com.digifreneur.logiman.backendsvc.controller;

import com.digifreneur.logiman.backendsvc.model.User;
import com.digifreneur.logiman.backendsvc.pojo.UserParam;
import com.digifreneur.logiman.backendsvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping
    public User addUser(@RequestBody UserParam user){
        return userService.addUser(user);
    }

}
