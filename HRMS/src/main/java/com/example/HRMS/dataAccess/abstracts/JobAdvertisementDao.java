package com.example.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HRMS.entities.concretes.Employer;
import com.example.HRMS.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	List<JobAdvertisement> findAllByOrderByPublishedDateDesc();
	
	List<JobAdvertisement> findAllByEmployer(Employer employer);

} 
