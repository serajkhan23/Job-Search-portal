package com.example.Job.Search.Portal.repository;

import com.example.Job.Search.Portal.model.Job;
import org.springframework.data.repository.CrudRepository;

public interface IJobRepo extends CrudRepository<Job,Long> {

}
