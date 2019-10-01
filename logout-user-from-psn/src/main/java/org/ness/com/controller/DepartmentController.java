/**
 * 
 */
package org.ness.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author localadmin
 *
 */
@Controller
public class DepartmentController {

	@GetMapping("/show/dept/home")
	public String showHome() {
		
		return "ajax";
	}
}
