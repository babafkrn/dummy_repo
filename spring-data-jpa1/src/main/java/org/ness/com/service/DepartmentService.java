/**
 * 
 */
package org.ness.com.service;

import org.ness.com.model.Department;
import org.ness.com.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author localadmin
 *
 */
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public void save(Department department) {
		
		departmentRepository.save(department);
	}
}
