package com.example.JobAppRevEx1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.JobAppRevEx1.model.JobPost;
import com.example.JobAppRevEx1.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo repo;
	
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}
	
	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();
	}

}
