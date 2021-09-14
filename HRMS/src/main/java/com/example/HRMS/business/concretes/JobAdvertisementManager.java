package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.JobAdvertisementService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.core.utilities.results.SuccessDataResult;
import com.example.HRMS.core.utilities.results.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.JobAdvertisementDao;
import com.example.HRMS.entities.concretes.Employer;
import com.example.HRMS.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result Add(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {

        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAllByOrderByPublishedDateDesc() {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByOrderByPublishedDateDesc());
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAllByEmployer(Employer Employer) {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAllByEmployer(Employer));
		
	}

}
