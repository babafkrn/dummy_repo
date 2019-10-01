package com.ness.com.springav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.ness.com.springav.model.Department;
import com.ness.com.springav.service.DepartmentService;

@SpringBootApplication
public class SpringDataJpa3BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa3BootApplication.class, args);
	}

}

@Component
class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private DepartmentService departmentService;

	@Override
	public void run(String... args) throws Exception {
		
		departmentService.save(new Department(129199, "Central Cosmetic", "Delhi"));
	}
}
