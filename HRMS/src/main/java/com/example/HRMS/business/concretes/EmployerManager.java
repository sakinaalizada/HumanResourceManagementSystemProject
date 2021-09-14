package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.EmployerService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.core.utilities.results.SuccessDataResult;
import com.example.HRMS.core.utilities.results.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.EmployerDao;

import com.example.HRMS.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result Add(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Employer>> GetAll() {
		
		return new SuccessDataResult<List<Employer>>(employerDao.findAll());
	}

	@Override
	public Result Update(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult();
	}

}
