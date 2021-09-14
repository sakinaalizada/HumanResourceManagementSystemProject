package com.example.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HRMS.entities.concretes.CV;
import com.example.HRMS.entities.concretes.JobSekeer;

public interface CVDao extends JpaRepository<CV, Integer>{
	
	List<CV> findAllByJobSekeer(JobSekeer jobSekeer);


}
