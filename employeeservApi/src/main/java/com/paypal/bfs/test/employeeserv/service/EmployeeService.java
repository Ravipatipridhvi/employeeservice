package com.paypal.bfs.test.employeeserv.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.paypal.bfs.test.employeeserv.exception.EmployeeNotFoundException;
import com.paypal.bfs.test.employeeserv.model.EmployeeEnitity;

@Service
public interface EmployeeService {

	EmployeeEnitity employeeGetById(@PathVariable("id") Long id);

	EmployeeEnitity addEmployee(@RequestBody EmployeeEnitity employee);

}
