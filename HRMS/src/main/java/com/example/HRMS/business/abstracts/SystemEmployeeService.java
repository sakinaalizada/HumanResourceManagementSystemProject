package com.example.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.SystemEmployee;

@Service
public interface SystemEmployeeService {
    Result Add(SystemEmployee systemEmployee);
	DataResult<List<SystemEmployee>> GetAll();
    Result Update(SystemEmployee systemEmployee);

}
