package com.paypal.bfs.test.employeeserv.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.bfs.test.employeeserv.exception.EmployeeNotFoundException;
import com.paypal.bfs.test.employeeserv.model.EmployeeEnitity;
import com.paypal.bfs.test.employeeserv.repositories.EmployeeRepository;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeEnitity employeeGetById(Long id) {
		Optional<EmployeeEnitity> optionalEntity = employeeRepository.findById(id);
		if (!optionalEntity.isPresent()) {
			throw new EmployeeNotFoundException("Employee not founf with given id " + id);
		}
		return optionalEntity.get();
	}

	@Override
	public EmployeeEnitity addEmployee(EmployeeEnitity employee) {
		EmployeeEnitity savedEntity = employeeRepository.save(employee);
		return savedEntity;
	}

}
