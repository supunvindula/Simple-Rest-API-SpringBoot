package me.supunvindula.springbootdemo.controllers;

import me.supunvindula.springbootdemo.domains.UserDomain;
import me.supunvindula.springbootdemo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDomain> allUsers(){
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public  String addUser(@RequestBody UserDomain Userdata){
        return userServices.saveUser(Userdata);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDomain newUserData){
        return userServices.updateUser(newUserData);
    }
    
    @GetMapping("/find/{id}")
    public UserDomain getUserById(@PathVariable Integer id){
        return userServices.findById(id);
    }


}
