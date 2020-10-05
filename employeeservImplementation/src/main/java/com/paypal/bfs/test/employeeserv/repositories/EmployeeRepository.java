package com.paypal.bfs.test.employeeserv.repositories;

import org.springframework.data.repository.CrudRepository;

import com.paypal.bfs.test.employeeserv.model.EmployeeEnitity;

public interface EmployeeRepository extends CrudRepository<EmployeeEnitity, Long> {

}
