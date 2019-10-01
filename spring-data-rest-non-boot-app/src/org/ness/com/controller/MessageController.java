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
public class MessageController {

	@GetMapping("/home")
	public String showHome() {
		
		System.out.println("inside showHome()");
		
		return "home";
	}
}
