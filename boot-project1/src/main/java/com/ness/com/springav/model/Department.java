/**
 * 
 */
package com.ness.com.springav.model;

/**
 * @author localadmin
 *
 */
public class Department {

	private int departmentNo;
	private String departmentName;
	private String location;
	
	public Department() {
	
	}
		
	public Department(int departmentNo, String departmentName, String location) {
		super();
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.location = location;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
