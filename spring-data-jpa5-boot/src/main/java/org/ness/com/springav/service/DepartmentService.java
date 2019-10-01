/**
 * 
 */
package org.ness.com.springav.service;

import java.util.List;
import java.util.Optional;

import org.ness.com.springav.exception.DepartmentNotFoundException;
import org.ness.com.springav.model.Department;
import org.ness.com.springav.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		
		List<Department> departmentsList = repository.findAll();
		
		departmentsList.forEach(item -> {
			System.out.println(item.getDeptno() + " " + item.getName() + " " + item.getLocation());
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
}
