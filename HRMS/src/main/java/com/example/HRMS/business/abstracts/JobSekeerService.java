package com.example.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.JobSekeer;

@Service
public interface JobSekeerService {
	Result Add(JobSekeer jobSekeer);
	DataResult<List<JobSekeer>> GetAll();

}
