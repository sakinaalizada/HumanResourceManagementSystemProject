package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.HRMS.business.abstracts.CityService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.core.utilities.results.SuccessDataResult;
import com.example.HRMS.core.utilities.results.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.CityDao;
import com.example.HRMS.entities.concretes.City;

public class CityManager implements CityService {
	
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result Add(City city) {
		cityDao.save(city);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<City>> GetAll() {
		return new SuccessDataResult<List<City>>(cityDao.findAll());
	}

}
