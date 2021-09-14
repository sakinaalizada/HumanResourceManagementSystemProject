package com.example.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.CVService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.CV;
import com.example.HRMS.entities.concretes.JobSekeer;

@RestController
@RequestMapping("/api/cvs")
public class CVController {
	private CVService cvService;
	
	@Autowired
	public CVController(CVService cvService) {
		super();
		this.cvService = cvService;
	}
      @GetMapping("/getall")
	public DataResult<List<CV>> getAll(){
    	return cvService.GetAll();
		
	}
    
      @PostMapping("/add")
  	public Result Add(CV cv){
       	return cvService.Add(cv);   		
   	}
      @GetMapping("/findAllByJobSekeer")
  	public DataResult<List<CV>> findAllByJobSekeer(JobSekeer jobSekeer){
      	return cvService.findAllByJobSekeer(jobSekeer);
  		
  	}
      
      @PutMapping("/update")
    	public Result Update(CV cv){
         	return cvService.Update(cv);   		
     	}
      
      
	

}
