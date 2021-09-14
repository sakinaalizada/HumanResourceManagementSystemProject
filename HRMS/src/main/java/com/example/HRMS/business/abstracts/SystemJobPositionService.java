package com.example.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.SystemJobPosition;

@Service
public interface SystemJobPositionService {
    Result Add(SystemJobPosition systemJobPosition);
	DataResult<List<SystemJobPosition>> GetAll();


}
