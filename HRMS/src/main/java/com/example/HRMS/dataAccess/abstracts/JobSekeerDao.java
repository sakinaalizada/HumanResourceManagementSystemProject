package com.example.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HRMS.entities.concretes.JobSekeer;

public interface JobSekeerDao extends JpaRepository<JobSekeer, Integer> {

}
