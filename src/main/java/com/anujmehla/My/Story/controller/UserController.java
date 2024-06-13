package com.anujmehla.My.Story.controller;

import com.anujmehla.My.Story.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("signup")
    public ResponseEntity<User> signup(@RequestBody User user) {
        return null;
    }

}
