/**
 * 
 */
package com.ness.com.springav.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ness.com.springav.model.Department;
import com.ness.com.springav.service.DepartmentService;

/**
 * @author localadmin
 *
 */
@RestController
public class AppController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/dept/{deptNo}")
	public Department getDepartmentDetailsById(@PathVariable int deptNo) {
		
		return departmentService.getDepartmentDetailsById(deptNo);
	}
	
	@GetMapping("/depts-list")
	public List<Department> findAllDepartments() {
		
		return departmentService.findAllDepartments();
	}
	
	@PostMapping("/dept-create")
	public ResponseEntity<String> createDepartment(@RequestBody Department department) {
		
		departmentService.save(department);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/create-bulk-depts")
	public ResponseEntity<String> createBulkdDeparments(ArrayList<Department> departmentsList) {
		
		departmentService.createBulkdDeparments(departmentsList);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/depts-by-location/{location}")
	public List<Department> findDepartmentsByLocation(@PathVariable("location") String location) {
		
		return departmentService.findDepartmentsByLocation(location);
	}
	
	@GetMapping("/depts-by-name-location/{name}/{location}")
	public List<Department> findDepartmentsByNameAndLocation(@PathVariable("name") String name, @PathVariable("location") String location) {
		
		return departmentService.findDepartmentsByNameAndLocation(name, location);
	}
	
	@GetMapping("/depts-query-by-name-location/{location}/{name}")
	public List<Department> queryDepartmentsByLocationAndName(@PathVariable("location") String location, @PathVariable("name") String name) {
		
		return departmentService.queryDepartmentsByLocationAndName(location, name);
	}
	
	@GetMapping("/depts-read-by-deptno-name-location/{deptno}/{name}/{location}")
	public List<Department> readDepartmentsByDeptnoAndNameAndLocation(@PathVariable int deptno, @PathVariable String name, @PathVariable String location) {
		
		return departmentService.readDepartmentsByDeptnoAndNameAndLocation(deptno, name, location);
	}
	
	@GetMapping("/depts-get-by-name-deptno/{name}/{deptNo}")
	public List<Department> getDepartmentsByNameAndDeptno(@PathVariable String name, @PathVariable int deptNo) {
	
		return departmentService.getDepartmentsByNameAndDeptno(name, deptNo);
	}
	
	@GetMapping("/depts-by-count/{deptNo}")
	public int countDepartmentsByDeptno(@PathVariable int deptNo) {
		
		return departmentService.countDepartmentsByDeptno(deptNo);
	}
	
	@GetMapping("/find-all-depts-by-pages/{pageNo}/{size}")
	public List<Department> findAllDepartmentsByPages(@PathVariable("pageNo") int pageNo, @PathVariable("size") int size) {
		
		return departmentService.findAllDepartmentsByPages(pageNo, size);
	}
	
	@GetMapping("/call-custom")
	public String callingCustomMethod() {
		
		return departmentService.customMethod();
	}
}