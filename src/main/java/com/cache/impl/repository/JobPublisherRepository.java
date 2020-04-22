package com.cache.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cache.impl.model.JobPublisher;
import com.cache.impl.model.User;

@Repository
public interface JobPublisherRepository extends JpaRepository<JobPublisher, Long> {
}
