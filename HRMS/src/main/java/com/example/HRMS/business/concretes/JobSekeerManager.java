package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.JobSekeerService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.core.utilities.results.SuccessDataResult;
import com.example.HRMS.core.utilities.results.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.JobSekeerDao;
import com.example.HRMS.entities.concretes.JobSekeer;

@Service
public class JobSekeerManager implements JobSekeerService {
	
	private JobSekeerDao jobSekeerDao;
	
	@Autowired
	public JobSekeerManager(JobSekeerDao jobSekeerDao) {
		super();
		this.jobSekeerDao = jobSekeerDao;
	}


	@Override
	public Result Add(JobSekeer jobSekeer) {
		jobSekeerDao.save(jobSekeer);
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<JobSekeer>> GetAll() {
		return new SuccessDataResult<List<JobSekeer>>(jobSekeerDao.findAll());
	}

}
