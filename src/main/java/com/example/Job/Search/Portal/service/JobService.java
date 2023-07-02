package com.example.Job.Search.Portal.service;

import com.example.Job.Search.Portal.model.Job;
import com.example.Job.Search.Portal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



import java.util.Optional;

@Service
public class JobService {
    @Autowired
    IJobRepo iJobRepo;
    public Job addJob(Job  job) {
        return iJobRepo.save(job);

    }

    public Optional<Job> updateJob(Long id, Job job) {
        Optional<Job> optionalEvent = iJobRepo.findById(id);
        Optional<Job> optionalJob;
        if (optionalJob.isPresent()) {
            Job existingJob = optionalJob.get();
            existingJob.setJob(job.getJob());
            existingJob.setLocationOfJob(job.getLocationOfEvent());
            existingJob.setDate(event.getDate());
            existingJob.setStartTime(job.getStartTime());
            existingJob.setEndTime(job.getEndTime());
            iJobRepo.save(existingJob);
        }
    return optionalJob;
    }

    public String deleteJob(Long jobId) {
        if(iJobRepo.existsById(jobId)) {
            iJobRepo.deleteById(jobId);
            return "Student with Id: "+jobId+ " is Deleted";
        }
        return "Student with Id: "+jobId+ " is not found";
    }

    public Iterable<Job> getAllJobs() {
        return iJobRepo.findAll();
    }

    public Optional<Job> getJobById(Long jobId) {
        return iJobRepo.findById(jobId);
    }
}
