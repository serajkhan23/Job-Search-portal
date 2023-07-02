package com.example.Job.Search.Portal.controller;


import com.example.Job.Search.Portal.model.Job;
import com.example.Job.Search.Portal.service.JobService;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("job")
    public Job addJob(@Validated @RequestBody Job job) {
        return jobService.addJob(job);
    }
    @PutMapping("updateJob/{Id}")
    public Optional<Job> updateJob(@PathVariable Long Id, @Validated @RequestBody Job job) {
        return jobService.updateJob(Id, job);
    }

    @DeleteMapping("deleteJob/{jobId}")
    public String deleteJob(@PathVariable Long jobId) {
        return jobService.deleteJob(jobId);
    }
    @GetMapping("getAllJobs")
    public Iterable<Job> getAllJobs() {
        return jobService.getAllJobs();
    }
    @GetMapping("getJobById/{jobId}")
    public Optional<Job> getStudentById(@PathVariable Long jobId) {
        return jobService.getJobById(jobId);
    }
}
