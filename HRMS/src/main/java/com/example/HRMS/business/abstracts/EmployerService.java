package com.example.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.Employer;

@Service
public interface EmployerService {
    Result Add(Employer employer);
	DataResult<List<Employer>> GetAll();
	Result Update(Employer employer);

}
