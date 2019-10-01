/**
 * 
 */
package org.ness.com.springav.repository;

import org.ness.com.springav.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author localadmin
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
