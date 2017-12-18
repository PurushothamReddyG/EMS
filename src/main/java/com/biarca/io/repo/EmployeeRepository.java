package com.biarca.io.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.biarca.io.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByName(@Param("name") String name);

	Employee findById(int id);

	boolean existsById(int id);


}
