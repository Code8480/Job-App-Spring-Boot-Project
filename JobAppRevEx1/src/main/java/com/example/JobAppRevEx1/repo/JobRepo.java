package com.example.JobAppRevEx1.repo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.JobAppRevEx1.model.JobPost;

@Repository
public class JobRepo {
	
	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
			new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
					3, List.of("HTML", "CSS", "JavaScript", "React")),
			new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
					List.of("Python", "Machine Learning", "Data Analysis")),
			new JobPost(4, "Network Engineer",
					"Design and implement computer networks for efficient data communication", 5,
					List.of("Networking", "Cisco", "Routing", "Switching")),
			new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
					3, List.of("iOS Development", "Android Development", "Mobile App")),
			new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
					4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")),
			new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces",
					2, List.of("User Experience", "User Interface Design", "Prototyping"))
			
			));
	
	public List<JobPost> getAllJobs(){
		return jobs;
	}
	
	public void addJob(JobPost job) {
		jobs.add(job);
		for(JobPost j :jobs) {
			System.out.println(j);
		}
	}

}
