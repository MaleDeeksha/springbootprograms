package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FirstController {
@RequestMapping("/first")
public String first() {
	return "wel come to programming world  deeksha";
}
@GetMapping("/second/{fname}/{lname}")
public  String second(@PathVariable("fname")String fname,@PathVariable("lname")String lname) {
	return "first Name is "+fname+ " Last Name is "+lname;
	
}
@PostMapping("/reverse")
//@ResponseBody
public String reverseString( @RequestParam String str) {
	return new StringBuilder(str).reverse().toString();
	//return "hello"+str;
}
}
