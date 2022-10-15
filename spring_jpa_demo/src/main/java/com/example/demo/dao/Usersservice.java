package com.example.demo.dao;

import com.example.demo.model.Users;
import com.example.demo.repository.UserjpaRespository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public  class Usersservice  {

    @Autowired
    UserjpaRespository userjpaRespository;

    public  Users findByName(String name) {

        return (Users) userjpaRespository;
    }

    public List<Users> findAll() {

        List<Users> usr = new ArrayList<>();
        return usr;
    }

    public void save(Users users) {
    }
}

