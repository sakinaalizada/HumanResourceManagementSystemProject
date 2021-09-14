package com.example.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.Employer;
import com.example.HRMS.entities.concretes.JobAdvertisement;

@Service
public interface JobAdvertisementService {
	Result Add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> findAllByOrderByPublishedDateDesc();
	DataResult<List<JobAdvertisement>> findAllByEmployer(Employer Employer);
	

}
