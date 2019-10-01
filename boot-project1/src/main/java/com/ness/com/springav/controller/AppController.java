/**
 * 
 */
package com.ness.com.springav.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author localadmin
 *
 */
@RestController
public class AppController {

	@RequestMapping(value = "/hello")
	public String sayHello() {
		
		return "Hello There...!";
	}
	
	@RequestMapping("/bye")
	public String sayGoodBye() {
		
		return "Good Bye...!";
	}
}
