package com.cache.impl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cache.impl.model.JobPublisher;
import com.cache.impl.repository.JobPublisherRepository;

@RestController
@RequestMapping("jobs")
public class JobPublisherController {
	@Autowired JobPublisherRepository jobPublisherRepository;
	
	@PostMapping
    public ResponseEntity<JobPublisher> createJobPublisher(@RequestBody JobPublisher jobs) {
		JobPublisher publisher = jobPublisherRepository.save(jobs);
        return new ResponseEntity<>(publisher, HttpStatus.OK);
    }
	
}
