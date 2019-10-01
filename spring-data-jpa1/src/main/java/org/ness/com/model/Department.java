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
	 * @param name
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
	public double getDeptNo() {
		return deptNo;
	}
	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
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
		
		return "Department [deptNo=" + deptNo + ", name=" + name + ", location=" +location + "]";
	}
}
