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

	@RequestMapping("/bye")
	public String sayBye() {
		
		return "Good Bye...!";
	}
}
