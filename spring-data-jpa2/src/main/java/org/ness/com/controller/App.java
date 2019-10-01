/**
 * 
 */
package org.ness.com.controller;

import org.ness.com.model.Department;
import org.ness.com.service.DepartmentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author localadmin
 *
 */
public class App {

	private static DepartmentService departmentService;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		departmentService = annotationConfigApplicationContext.getBean(DepartmentService.class);
		
		// create
		departmentService.save(new Department(129197,"Central EAE", "Bangalore"));
		
		// get by name
		departmentService.findDepartmentByName("Central EAE");
		
		// delete by dept no
		departmentService.delteDepartmentById(129197);
		
		// get by id
		departmentService.getDepartmentDetailsById(12);
		
		// get all
		departmentService.findAllDepartments();
	}
}
