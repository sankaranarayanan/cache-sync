package com.cache.impl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_publisher")
public class JobPublisher {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
	@Column(name = "topic")
    private String topic;
	@Column(name = "message")
    private String message;
	@Column(name = "status")
    private String status;
	
    public JobPublisher() {
        super();
    }
    
    
    public JobPublisher(final Integer id, final String topic, final String message, final String status) {
    	this.id = id;
        this.status = status;
        this.topic = topic;
        this.message = message;
    }

    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
