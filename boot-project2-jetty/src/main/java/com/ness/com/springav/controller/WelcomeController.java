/**
 * 
 */
package com.ness.com.springav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author localadmin
 *
 */
@Controller
public class WelcomeController {

	@RequestMapping("/message1")
	public String getMessage() {
		
		return "welcome";
	}
}
