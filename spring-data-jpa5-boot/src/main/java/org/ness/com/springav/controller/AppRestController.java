/**
 * 
 */
package org.ness.com.springav.controller;

import java.util.List;

import org.ness.com.springav.model.Department;
import org.ness.com.springav.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author localadmin
 *
 */
@RestController
public class AppRestController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/dept-list")
	public List<Department> getDetptByDeptNo() {

		return departmentService.findAllDepartments();
	}
}
