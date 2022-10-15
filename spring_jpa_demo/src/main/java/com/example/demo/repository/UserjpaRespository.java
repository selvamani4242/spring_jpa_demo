package com.example.demo.repository;

import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserjpaRespository extends JpaRepository<Users,Long>{

    Users findByName(String name);
}
