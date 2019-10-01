/**
 * 
 */
package org.ness.com.controller;

import org.ness.com.model.Department;
import org.ness.com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author localadmin
 *
 */
@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/create-dept/{id}/{name}/{location}")
	public String createDeaprtment(@PathVariable("id") int deptNo,@PathVariable("name") String name,@PathVariable("location") String location, ModelMap modelMap) {
		
		System.out.println(deptNo + "-" + name + "-" + location);
		
		departmentService.save(new Department(deptNo, name, location));
		
		modelMap.put("message", "Department Added Successfully");
		
		return "DeptAdd";
	}
}
