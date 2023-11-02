package com.mrvkings.springcaching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Employee")
public class EmployeeController {
	
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("{id}")
	public void getEmployee(@PathVariable("id") Integer employeeId) {
		logger.info("getEmployee - EmployeeController");
//		System.out.println("Getting Employee:"+employeeId);
		employeeService.getEmployee(employeeId);
	}
	@PutMapping
	public void updateEmployee(@RequestBody Employee e) {
		logger.info("updateEmployee - EmployeeController");
//		System.out.println("Updating Employee with id: "+e.getId());
		employeeService.updateEmployee(e);
		
	}
	@DeleteMapping("{id}")
	public void deleteEmployee(@PathVariable("id") Integer employeeId) {
		logger.info("deleteEmployee - EmployeeController");
//		System.out.println("Deleting Employee with id: "+employeeId);
		employeeService.deleteEmployee(employeeId);
	}
		
	

}
