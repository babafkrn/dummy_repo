/**
 * 
 */
package com.ness.com.springav.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.ness.com.springav.exception.DepartmentNotFoundException;
import com.ness.com.springav.model.Department;
import com.ness.com.springav.repository.DepartmentRepository;

/**
 * @author localadmin
 *
 */
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	// create
	public void save(Department department) {
		
		repository.save(department);
	}
	
	// get all
	public List<Department> findAllDepartments() {
		
		System.out.println("inside findAllDepartments");

		List<Department> departmentsList = repository.findAll();
		
		departmentsList.forEach(item -> { 
			System.out.println(item.getDeptno() + " " +item.getName() + " " + item.getLocation()); 
		});
		
		return departmentsList;
	}
	
	// get specific department
	public Department getDepartmentDetailsById(int deptNo) {
		
		Optional<Department> optional = repository.findById(deptNo);
		
		if(!optional.isPresent()) 
			throw new DepartmentNotFoundException();
		
		return optional.get();
	}
	
	// delete
	public void delteDepartmentById(int deptNo) {
		
		repository.deleteById(deptNo);
	}
	
	// find by name
	public Department findDepartmentByName(String name) {
		
		List<Department> departmentsList = repository.findAll();
		
		Department department = departmentsList.stream().filter(x -> x.getName().equals(name)).findAny().orElse(null);

		//System.out.println(department.getDeptNo() + " " + department.getDeptName() + " " + department.getLocation());
		return department;
	}

	// find by location
	public List<Department> findDepartmentsByLocation(String location) {
	
		return repository.findByLocation(location);
	}
	
	// create bulk departments
	@Transactional
	public void createBulkdDeparments(List<Department> departmentsList) {
		
		System.out.println("inside createBulkdDeparments(): " + departmentsList);
		
		departmentsList.forEach(item -> {
			
			System.out.println(item.getDeptno() + " " + item.getName() + " " + item.getLocation());
			
			repository.save(item);
		});
	}
	
	// find by name and location
	public List<Department> findDepartmentsByNameAndLocation(String name, String location) {
		
		return repository.findByNameAndLocation(name, location);
	}
	
	// query by location and name
	public List<Department> queryDepartmentsByLocationAndName(String location, String name) {
		
		return repository.queryByLocationAndName(location, name);
	}
	
	// read by dept no, name and location
	public List<Department> readDepartmentsByDeptnoAndNameAndLocation(int deptNo, String name, String location) {
		
		return repository.readByDeptnoAndNameAndLocation(deptNo, name, location);
	}

	// get by dept no and name
	public List<Department> getDepartmentsByNameAndDeptno(String name, int deptNo) {
		
		return repository.getByNameAndDeptno(name, deptNo);
	}
	
	// count by dept no
	public int countDepartmentsByDeptno(int deptNo) {
		
		return repository.countByDeptno(deptNo);
	}
	
	public List<Department> findAllDepartmentsByPages(int pageNo, int size) {
		
		return repository.findAll(PageRequest.of(pageNo, size)).getContent();
	}
	
	// custom repositories example
	public String customMethod() {
		
		return repository.customeMethod();
	}
}
