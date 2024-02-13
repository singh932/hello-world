package com.webapp.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String helloWorld2() {
		return "hello world this is app services with java date 13 Feb..................!";
	} 

	@GetMapping("/abc")
	public String helloWorld3() {
		return "hello world this is app services with jav..................!";
	} 
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "hello world..................!";
	} 
	@GetMapping("/hello")
	public String helloWorld1() {
		return "hello world this is java application..................!";
	} 
}
