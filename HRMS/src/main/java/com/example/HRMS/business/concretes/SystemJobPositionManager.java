package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.HRMS.business.abstracts.SystemJobPositionService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.core.utilities.results.SuccessDataResult;
import com.example.HRMS.core.utilities.results.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.SystemJobPositionDao;
import com.example.HRMS.entities.concretes.SystemJobPosition;

public class SystemJobPositionManager implements SystemJobPositionService{
	
	private SystemJobPositionDao systemJobPositionDao;
	
	@Autowired
	public SystemJobPositionManager(SystemJobPositionDao systemJobPositionDao) {
		super();
		this.systemJobPositionDao = systemJobPositionDao;
	}

	@Override
	public Result Add(SystemJobPosition systemJobPosition) {
		systemJobPositionDao.save(systemJobPosition);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<SystemJobPosition>> GetAll() {
		return new SuccessDataResult<List<SystemJobPosition>>(systemJobPositionDao.findAll());
	}

}
