package com.ness.com.springav;

import org.ness.com.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BootProject6HelloServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProject6HelloServiceAppApplication.class, args);
	}
	
	// my own opinion
	/*
	 * @Bean public HelloServicceImpl helloService2() {
	 * 
	 * return new HelloServicceImpl("Welcome", "To Spring Boot Auto Configuration");
	 * }
	 */
}

@Component
class MyCommandLineRunner implements CommandLineRunner {

	private HelloService helloService;
	
	@Autowired
	public MyCommandLineRunner(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		helloService.sayHello("Baba");
	}
	
}
