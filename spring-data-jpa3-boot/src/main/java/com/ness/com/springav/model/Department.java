/**
 * 
 */
package com.ness.com.springav.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * @author localadmin
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Department.findAllDeptsBasedOnNameAndLocation", query = "select de from Department de where de.name=?1 and de.location=?2"),
	@NamedQuery(name = "Department.findAllDeptsBasedOnLocationAndName", query = "select de from Department de where de.location=?1 and de.name=?2"),
})
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

	@Override
	public String toString() {
		
		return "Department [deptNo= " + deptno + ", deptName=" + name + ", location=" +location + "]";
	}
}
