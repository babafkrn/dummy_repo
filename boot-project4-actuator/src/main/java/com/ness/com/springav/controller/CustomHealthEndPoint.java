/**
 * 
 */
package com.ness.com.springav.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

/**
 * @author localadmin
 *
 */
@Component
@Endpoint(id = "custom-health")
public class CustomHealthEndPoint {

	@ReadOperation
	public CustomHealth health() {
		
		Map<String, Object> healthDetails = new LinkedHashMap<>();
		healthDetails.put("CustomHealthStatus", "Every Thing Looks Good.");
		
		CustomHealth customHealth = new CustomHealth();
		customHealth.setHealthDetails(healthDetails);
		return customHealth;
	}
	
	@ReadOperation
	public String customEndPointByName(@Selector String name) {
		
		return "custom-end-point";
	}
	
	@WriteOperation
	public void writeOperation(@Selector String name) {
		// write operation code here
	}
	
	@DeleteOperation
	public void deleteOperation(@Selector String name) {
		// delete operation code here
	}
}