package mikefallonit.workrecord.controllers;


import mikefallonit.workrecord.models.Job;
import mikefallonit.workrecord.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/jobs")

public class JobController {
    @Autowired
    JobRepository jobRepository;

    @GetMapping
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Job> getJob(@PathVariable Long id){
        return jobRepository.findById(id);
    }

}
