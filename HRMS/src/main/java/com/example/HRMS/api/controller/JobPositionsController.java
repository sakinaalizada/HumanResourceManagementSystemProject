package com.example.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.JobPositionService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
    	return jobPositionService.GetAll();
		
	}
    
    @PostMapping("/add")
   	public Result Add(JobPosition jobPosition){
       	return jobPositionService.Add(jobPosition);
   		
   	}
    
//    @PutMapping("update")
//   	public Result Update(JobPosition jobPosition){
//       	return jobPositionService.Update(jobPosition);
//   		
//   	}
//    
//    @DeleteMapping("/delete")
//   	public Result Delete(JobPosition jobPosition){
//       	return jobPositionService.Delete(jobPosition);
//   		
//   	}
	

}
