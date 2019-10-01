/**
 * 
 */
package org.ness.com.controller;

import org.ness.com.model.Department;
import org.ness.com.service.DepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author localadmin
 *
 */
public class App {

	public static void main(String... args) {
				
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/ness/com/controller/beans.xml");
		DepartmentService departmentService = applicationContext.getBean(DepartmentService.class);
		departmentService.save(new Department(129203, "Central Automobile Engineering", "Bangalore"));
	}
}
