package me.supunvindula.springbootdemo.services.implementation;

import me.supunvindula.springbootdemo.domains.UserDomain;
import me.supunvindula.springbootdemo.repositories.UserRepository;
import me.supunvindula.springbootdemo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserServices {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserDomain> findAllUsers() {
        //return all users from database
        return userRepository.findAll();
    }

    @Override
    public String saveUser(UserDomain userdata) {
        userRepository.save(userdata);
        return "Data Saved!";
    }

    @Override
    public String updateUser(UserDomain newUserData) {
        if(newUserData.getId() != null){
            userRepository.save(newUserData);
            return "data updated";
        }
        else{
            return "error";
        }
    }

    @Override
    public UserDomain findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}
