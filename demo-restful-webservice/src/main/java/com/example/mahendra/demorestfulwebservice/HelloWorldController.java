package com.example.mahendra.demorestfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mahendra.demorestfulwebservice.bean.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {

		return "Hello world Testing";

	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {

		return new HelloWorldBean("Hello world Bean");

	}
	
}
