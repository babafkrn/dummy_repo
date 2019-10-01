/**
 * 
 */
package com.ness.com.springav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ness.com.springav.model.Department;
import com.ness.com.springav.repository.DepartmentDAO;

/**
 * @author localadmin
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Override
	public void save(Department department) {
		
		departmentDAO.save(department);
	}
}
