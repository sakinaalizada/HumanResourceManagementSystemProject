package com.example.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.JobSekeerService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.JobSekeer;

@RestController
@RequestMapping("/api/jobSekeers")
public class JobSekeersController {
	private JobSekeerService jobSekeerService;

	@Autowired
	public JobSekeersController(JobSekeerService jobSekeerService) {
		super();
		this.jobSekeerService = jobSekeerService;
	}
    @GetMapping("/getall")
    public DataResult<List<JobSekeer>> getAll(){
     	return jobSekeerService.GetAll();
			
	}
	    
	 @PostMapping("/add")
   	public Result Add(JobSekeer jobSekeer){
	    return jobSekeerService.Add(jobSekeer);
	   		
	   	}
//	    
//	    @PutMapping("update")
//	   	public Result Update(JobSekeer jobSekeer){
//	       	return jobSekeerService.Update(jobSekeer);
//	   		
//	   	}
//	    
//	    @DeleteMapping("/delete")
//	   	public Result Delete(JobSekeer jobSekeer){
//	       	return jobSekeerService.Delete(jobSekeer);
//	   		
//	   	}
//

}
