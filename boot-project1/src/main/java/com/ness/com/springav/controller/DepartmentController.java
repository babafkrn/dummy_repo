/**
 * 
 */
package com.ness.com.springav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ness.com.springav.model.Department;
import com.ness.com.springav.service.DepartmentService;

/**
 * @author localadmin
 *
 */
@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/dept/add")
	public String createDepartment(@RequestParam("dno") int dno, @RequestParam("dname") String dname, @RequestParam("location") String location) {
		
		Department department = new Department(dno, dname, location);
		
		departmentService.save(department);
		
		return "departmentAdd";
	}
}
