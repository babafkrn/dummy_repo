/**
 * 
 */
package org.ness.com.springav.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.ness.com.springav.model.Department;
import org.springframework.stereotype.Service;

/**
 * @author localadmin
 *
 */
@Service
public class DepartmentService {

	private List<Department> departmentsList;

	@PostConstruct
	public void initDataForTesting() {
		
		departmentsList = new ArrayList<>();
		
		Department department1 = new Department(1101, "Geology", "Mumbai");
		Department department2 = new Department(1102, "Botany", "Chennai");
		Department department3 = new Department(1103, "Agriculture", "Hyderabad");
		
		departmentsList.add(department1);
		departmentsList.add(department2);
		departmentsList.add(department3);
	}
	
	public List<Department> findDepartmentByNo(String name) {
		
		return departmentsList.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
	}
}
