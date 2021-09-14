package com.example.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.JobAdvertisementService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.Employer;
import com.example.HRMS.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	 public DataResult<List<JobAdvertisement>> getAll(){
	  	return jobAdvertisementService.getAll();
				
	}
		    
	 @PostMapping("/add")
	  public Result Add(JobAdvertisement jobAdvertisement){
	    return jobAdvertisementService.Add(jobAdvertisement);
		   		
   	}
	 
	 @GetMapping("/findAllByOrderByPublishedDateDesc")
	 public DataResult<List<JobAdvertisement>> findAllByOrderByPublishedDateDesc(){
	  	return jobAdvertisementService.findAllByOrderByPublishedDateDesc();
			
	}
	 @GetMapping("/findAllByEmployer")
	 public DataResult<List<JobAdvertisement>> findAllByEmployer(Employer Employer){
	  	return jobAdvertisementService.findAllByEmployer(Employer);
			
	}

}
