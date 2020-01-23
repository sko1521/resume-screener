package com.springernature.resumescreener.service;

import com.springernature.resumescreener.domain.JobInfo;
import com.springernature.resumescreener.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<JobInfo> allJobPost() {
        return jobRepository.findAll();
    }
}
