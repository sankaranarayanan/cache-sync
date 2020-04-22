package com.cache.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cache.impl.model.JobPublisher;
import com.cache.impl.repository.JobPublisherRepository;

@Service
public class JobPublisherService {
	@Autowired JobPublisherRepository jobPublisherRepository;
	
	@Value("${service.resourceurl}")
	private String resourceUrl;
    
	public void publish(JobPublisher job){
    	RestTemplate restTemplate = new RestTemplate();
    	 
    	HttpEntity<JobPublisher> request = new HttpEntity<>(job);
    	restTemplate.postForObject(resourceUrl, request, JobPublisher.class);    	
    }	
}
