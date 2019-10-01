/**
 * 
 */
package org.ness.com.springav.model;

import java.util.List;

/**
 * @author localadmin
 *
 */
public class AjaxResponseBody {

	private String msg;
	private List<Department> result;
	
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the result
	 */
	public List<Department> getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(List<Department> result) {
		this.result = result;
	}
}
