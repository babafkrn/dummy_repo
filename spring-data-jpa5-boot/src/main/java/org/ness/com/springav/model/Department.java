/**
 * 
 */
package org.ness.com.springav.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author localadmin
 *
 */
@Entity
public class Department {
	
	@Id
	private int deptno;
	
	private String name;
	
	private String location;
	
	public Department() {
		
	}
	
	/**
	 * @param deptNo
	 * @param deptName
	 * @param location
	 */
	public Department(int deptNo, String name, String location) {
		super();
		this.deptno = deptNo;
		this.name = name;
		this.location = location;
	}

	/**
	 * @return the deptNo
	 */
	public int getDeptno() {
		return deptno;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptno(int deptNo) {
		this.deptno = deptNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		
		return "Department [deptNo= " + deptno + ", deptName=" +name + ", location=" +location + "]";
	}
}
