package com.example.demo.Controller;

import com.example.demo.dao.Usersservice;
import com.example.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.UserjpaRespository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Usersservice usersservice;

    @GetMapping(value ="/all")
    public List<Users> findAll(){
        return usersservice.findAll();
    }

    @GetMapping(value = "/{name}")
    public Users findByName(@PathVariable final String name){
        return usersservice.findByName(name);
    }

   // @GetMapping(value = "/test")
   // public Users test(){
     //   Users user = new Users();
      //  user.setId(5544);
      //  user.setName("selva");
      //  user.setTeamName("Development");
      //  user.setSalary(50000);
      //  return user;
   // }

    @PostMapping(value = "/load")
     public Users load(@RequestBody final Users users){
        System.out.println(users+"debug");
          usersservice.save(users);
        return usersservice.findByName(users.getName());
    }

}
