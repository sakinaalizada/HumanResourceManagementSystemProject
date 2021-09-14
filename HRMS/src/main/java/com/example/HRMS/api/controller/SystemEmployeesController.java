package com.example.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.SystemEmployeeService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.entities.concretes.SystemEmployee;

@RestController
@RequestMapping("/api/systemEmployees")
public class SystemEmployeesController {
	private SystemEmployeeService systemEmployeeService;

	@Autowired
	public SystemEmployeesController(SystemEmployeeService systemEmployeeService) {
		super();
		this.systemEmployeeService = systemEmployeeService;
	}
	
	 @GetMapping("/getall")
		public DataResult<List<SystemEmployee>> getAll(){
	    	return systemEmployeeService.GetAll();
			
		}
	    
	    @PostMapping("/add")
	   	public Result Add(SystemEmployee systemEmployee){
	       	return systemEmployeeService.Add(systemEmployee);
	   		
	   	}
	    
	    @PutMapping("update")
	   	public Result Update(SystemEmployee systemEmployee){
	       	return systemEmployeeService.Update(systemEmployee);
	   		
	   	}
//	    
//	    @DeleteMapping("/delete")
//	   	public Result Delete(SystemEmployee systemEmployee){
//	       	return systemEmployeeService.Delete(systemEmployee);
//	   		
//	   	}

}
