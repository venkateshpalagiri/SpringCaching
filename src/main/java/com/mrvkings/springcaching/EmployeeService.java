package com.mrvkings.springcaching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	
	Logger logger=LoggerFactory.getLogger(EmployeeService.class);
	@Cacheable("employees")
	public void getEmployee(Integer employeeId) {
		logger.info("getEmployee - EmployeeService");
		System.out.println("Getting Employee:"+employeeId);
	}
	@CachePut("employees")
	public void updateEmployee(Employee e) {
		logger.info("updateEmployee - EmployeeService");
		System.out.println("Updating Employee with id: "+e.getId());
	}
	@CacheEvict("employees")
	public void deleteEmployee(Integer employeeId) {
		logger.info("deleteEmployee - EmployeeService");
		System.out.println("Deleting Employee with id: "+employeeId);
	}

}
