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
public class HelloController {

	@GetMapping(value = "/hello")
	public String sayHello() {
		
		return "helloWorld";
	}
}
