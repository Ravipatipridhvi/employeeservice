package com.paypal.bfs.test.employeeserv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.model.EmployeeEnitity;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	EmployeeService employeeService;

	@Override
	public ResponseEntity<EmployeeEnitity> employeeGetById(Long id) {
		EmployeeEnitity employee = this.employeeService.employeeGetById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<EmployeeEnitity> addEmployee(EmployeeEnitity employee) {
		EmployeeEnitity savedEntity = this.employeeService.addEmployee(employee);
		return new ResponseEntity<>(savedEntity, HttpStatus.OK);
	}
}
