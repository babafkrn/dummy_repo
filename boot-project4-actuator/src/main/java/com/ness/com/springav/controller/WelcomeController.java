/**
 * 
 */
package com.ness.com.springav.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author localadmin
 *
 */
@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message}")
	private String message;
	
	@GetMapping("/hello")
	public String sayHello(Map<String, Object> map) {
		
		map.put("message", this.message);
		return "welcomePage";
	}
}
