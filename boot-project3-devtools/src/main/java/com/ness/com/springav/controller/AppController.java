/**
 * 
 */
package com.ness.com.springav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author localadmin
 *
 */
@Controller
public class AppController {

	@GetMapping("/hello")
	public String getMessage() {
		
		
		return "helloPage";
	}
}
