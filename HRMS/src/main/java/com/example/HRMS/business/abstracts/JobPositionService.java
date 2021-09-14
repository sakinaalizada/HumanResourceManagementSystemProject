package com.example.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.JobPosition;

@Service
public interface JobPositionService {
	Result Add(JobPosition jobPosition);
	DataResult<List<JobPosition>>  GetAll();

}
