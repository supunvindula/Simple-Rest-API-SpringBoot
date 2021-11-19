package me.supunvindula.springbootdemo.repositories;

import me.supunvindula.springbootdemo.domains.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDomain,Integer> {
    //getallusers
    //findbyid
    //update
    //customQuery
}
