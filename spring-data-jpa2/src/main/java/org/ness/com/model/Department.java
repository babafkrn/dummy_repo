/**
 * 
 */
package org.ness.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author localadmin
 *
 */
@Entity
public class Department {

	@Id
	private int deptNo;
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
		this.deptNo = deptNo;
		this.name = name;
		this.location = location;
	}

	/**
	 * @return the deptNo
	 */
	public int getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return name;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String name) {
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
		
		return "Department [deptNo= " + deptNo + ", deptName=" +name + ", location=" +location + "]";
	}
}
