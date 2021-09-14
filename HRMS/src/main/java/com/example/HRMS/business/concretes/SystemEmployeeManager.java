package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.SystemEmployeeService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.core.utilities.results.SuccessDataResult;
import com.example.HRMS.core.utilities.results.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.SystemEmployeeDao;
import com.example.HRMS.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {
	
    private SystemEmployeeDao systemEmployeeDao;
    
    @Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		super();
		this.systemEmployeeDao = systemEmployeeDao;
	}

    @Override
	public Result Add(SystemEmployee systemEmployee) {
    	systemEmployeeDao.save(systemEmployee);
		return new SuccessResult();
		
	}

	@Override
	public DataResult<List<SystemEmployee>> GetAll() {
		return new SuccessDataResult<List<SystemEmployee>>(systemEmployeeDao.findAll());
	}

	@Override
	public Result Update(SystemEmployee systemEmployee) {
		systemEmployeeDao.save(systemEmployee);
		return new SuccessResult();
	}


}
