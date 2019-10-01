/**
 * 
 */
package com.ness.com.springav.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ness.com.springav.model.Department;

/**
 * @author localadmin
 *
 */
@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void save(Department department) {

		jdbcTemplate.update("insert into department values(?, ?, ?)", department.getDepartmentNo(), department.getDepartmentName(), department.getLocation());
	}

}
