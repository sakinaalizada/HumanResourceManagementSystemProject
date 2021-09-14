package com.example.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.EmployerService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
      @GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
    	return employerService.GetAll();
		
	}
    
      @PostMapping("/add")
  	public Result Add(@RequestBody Employer employer){
       	return employerService.Add(employer);   		
   	}
    
    @PutMapping("update")
   	public Result Update(Employer employer){
       	return employerService.Update(employer);
   		
   	}
    
//    @DeleteMapping("/delete")
//   	public Result Delete(Employer employer){
//       	return employerService.Delete(employer);
//   		
//   	}

}
