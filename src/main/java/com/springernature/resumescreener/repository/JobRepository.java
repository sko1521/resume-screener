package com.springernature.resumescreener.repository;

import com.springernature.resumescreener.domain.JobInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<JobInfo,String> {
//    JobInfo findJobByTitle(String name);
}
