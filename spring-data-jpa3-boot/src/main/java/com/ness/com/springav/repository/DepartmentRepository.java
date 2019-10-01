/**
 * 
 */
package com.ness.com.springav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ness.com.springav.model.Department;

/**
 * @author localadmin
 *
 */
@Repository
@RepositoryRestResource(path = "department-details")
public interface DepartmentRepository extends JpaRepository<Department, Integer>, MyJpaRepositoryCustom {

	public List<Department> findByLocation(String location);
	
	public List<Department> findByNameAndLocation(String name, String location);
	
	public List<Department> queryByLocationAndName(String location, String name);
	
	public List<Department> readByDeptnoAndNameAndLocation(int deptNo, String name, String location);
	
	public List<Department> getByNameAndDeptno(String name, int deptNo);
	
	public int countByDeptno(int deptNo);
	
	@Query("select d from Department d")
	public List<Department> readAllDepartments();
	
	@Query("select de from Department de where de.name=?1")
	public List<Department> readAllDepartmentsByName(String name);
	
	@Query("select de from Department de where de.location=:location")
	public List<Department> readAllDepartmentsByLocation(@Param("location") String location);
	
	@Query(value = "select * from Department where name=?1", nativeQuery = true)
	public List<Department> readAllDeparmentsByNames(String name);
	
	@Transactional
	@Modifying
	@Query("delete Department de where de.name=?1")
	public int deleteByName(String name);
	
	public List<Department> findAllDeptsBasedOnNameAndLocation(String name, String location);
	
	public List<Department> findAllDeptsBasedOnLocationAndName(String location, String name);
	
	@Transactional
	@Modifying
	@Query("update Department de set de.name=?1 where de.deptno=?2")
	public int updateDeptDetails(String name, int deptNo);
}  
