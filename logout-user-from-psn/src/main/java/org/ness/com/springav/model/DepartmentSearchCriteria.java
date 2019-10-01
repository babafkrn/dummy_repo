/**
 * 
 */
package org.ness.com.springav.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author localadmin
 *
 */
public class DepartmentSearchCriteria {

    @NotBlank(message = "department no can't empty!")
	private String deptno;

	/**
	 * @return the deptno
	 */
	public String getDeptno() {
		return deptno;
	}

	/**
	 * @param deptno the deptno to set
	 */
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
}
