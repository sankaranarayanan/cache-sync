package com.cache.impl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cache.impl.model.User;
import com.cache.impl.service.UserService;

@RestController
@RequestMapping("cache-synch")
public class CacheSynchController {
	@Autowired UserService userService;
	
	
	@GetMapping
    public ResponseEntity<List<User>> getUsers() {
		List<User> users = userService.findAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
	
    @PostMapping
    public ResponseEntity<Long> createUser(@RequestBody User user) {
        User savedUsers = userService.save(user);
        return new ResponseEntity<>(savedUsers.getId(), HttpStatus.OK);
    }
}
