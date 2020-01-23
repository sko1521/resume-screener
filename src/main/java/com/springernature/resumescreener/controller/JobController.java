package com.springernature.resumescreener.controller;

import com.springernature.resumescreener.domain.JobInfo;
import com.springernature.resumescreener.service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class JobController {

    @Autowired
    JobServiceImpl jobServiceImp;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/getJobInfo")
    public List<JobInfo> getAllPost(){
        return jobServiceImp.allJobPost();
    }

}
