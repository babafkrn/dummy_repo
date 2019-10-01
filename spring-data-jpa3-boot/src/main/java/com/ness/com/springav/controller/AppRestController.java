/**
 * 
 */
package com.ness.com.springav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ness.com.springav.model.Department;
import com.ness.com.springav.repository.DepartmentRepository;

/**
 * @author localadmin
 *
 */
@RestController
public class AppRestController {

	@Autowired
	private DepartmentRepository repository;
	
	@GetMapping("/read-all-depts")
	public List<Department> readAllDepartments() {
		
		return repository.readAllDepartments();
	}
	
	@GetMapping("/read-all-depts-by-name/{name}")
	public List<Department> readAllDepartmentsByName(@PathVariable("name") String name) {
		
		return repository.readAllDepartmentsByName(name);
	}
	
	@GetMapping("/read-all-depts-by-location/{location}")
	public List<Department> readAllDepartmentsByLocation(@PathVariable("location") String location) {
		
		return repository.readAllDepartmentsByLocation(location);
	}
	
	@GetMapping("/read-all-depts-by-names")
	public List<Department> readAllDeparmentsByNamesByNamedQuery(@RequestParam("name") String name) {
		
		return repository.readAllDeparmentsByNames(name);
	}
	
	@GetMapping("/delete-depts-by-name")
	public int deleteByName(@RequestParam("name") String name) {
		
		return repository.deleteByName(name);	
	}
	
	@GetMapping("/find-all-depts-based-on-name-and-location")
	public List<Department> findAllDeptsBasedOnNameAndLocation(@RequestParam("name") String name, @RequestParam("location") String location) {
		
		return repository.findAllDeptsBasedOnNameAndLocation(name, location);
	}
	
	@GetMapping("/find-all-depts-based-on-location-and-name/{location}/{name}")
	public List<Department> findAllDeptsBasedOnLocationAndName(@PathVariable("location") String location, @PathVariable("name") String name) {
		
		return repository.findAllDeptsBasedOnLocationAndName(location, name);
	}
	
	@GetMapping("/update-depts-details/{name}/{deptNo}")
	public Department updateDeptDetails(@PathVariable("name") String name, @PathVariable("deptNo") int deptNo) {
		
		repository.updateDeptDetails(name, deptNo);
		
		return repository.findById(deptNo).get();
	}
	
	@PostMapping("/create-dept")
	@ResponseStatus(HttpStatus.CREATED)
	public void createDepartment(@RequestBody Department department) {
		
		
		repository.save(department);
	}
}
