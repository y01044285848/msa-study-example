package com.example.springmongotest.controller;

import com.example.springmongotest.document.User1Document;
import com.example.springmongotest.service.User1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class User1Controller {

    private final User1Service user1Service;

    @GetMapping("/user1")
    public List<User1Document> findUser1All() {
        return user1Service.findUser1All();
    }

    @GetMapping("/user1/{uid}")
    public User1Document findUser1(@PathVariable("uid") String uid) {
        return user1Service.findUser1(uid).get();
    }

    @PostMapping("/user1")
    public User1Document insertUser1(@RequestBody User1Document user) {
        return user1Service.insertUser1(user);
    }

    @PutMapping("/user1")
    public User1Document updateUser1(@RequestBody User1Document user) {
        return user1Service.updateUser1(user);
    }

    @DeleteMapping("/user1/{uid}")
    public void deleteUser1(@PathVariable("uid") String uid) {
        user1Service.deleteUser1(uid);
    }

}
