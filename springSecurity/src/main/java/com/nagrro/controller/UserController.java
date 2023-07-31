package com.nagrro.controller;

import com.nagrro.entity.User;
import com.nagrro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/v1/api")
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(User user){
        return userService.saveUser(user);
    }

    @PostMapping("/alluser")
    public List<User> saveAllUser(List<User> userList){
        return userService.saveAllUser(userList);
    }

    @GetMapping("/")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{userName}")
    public Optional<User> getByUserName(Long id){
        return userService.getByUserName(id);
    }

    @DeleteMapping("/{userName}")
    public String deleteByID(Long id){
       return userService.deleteByID(id);

    }

    @PutMapping("/update/{userName}")
    public User updateUser(User user,Long id){
       return userService.updateUser(user,id);
    }
}
