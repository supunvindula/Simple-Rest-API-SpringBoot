package me.supunvindula.springbootdemo.services;

import me.supunvindula.springbootdemo.domains.UserDomain;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserServices {
    List<UserDomain> findAllUsers();

    String saveUser(UserDomain userdata);

    String updateUser(UserDomain newUserData);

    UserDomain findById(Integer id);
}
