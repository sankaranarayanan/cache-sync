package com.cache.impl.service;

import org.springframework.stereotype.Service;

import com.cache.impl.model.JobPublisher;
import com.cache.impl.model.User;
import com.cache.impl.repository.JobPublisherRepository;
import com.cache.impl.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

@Service
public class UserService {
	@Autowired UserRepository userRepository;
	@Autowired JobPublisherService jobPublisherService;
	
    @Cacheable("users")
	public List<User> findAllUser() {
        List<User> users = userRepository.findAll();
        return users;
	}
	
    public User save(User user){
    	User savedUser= userRepository.save(user);
    	JobPublisher jobPublisher = new JobPublisher();
    	jobPublisher.setStatus("0");
    	jobPublisher.setMessage(savedUser.toString());
    	jobPublisherService.publish(jobPublisher);
        return savedUser;
    }
}
