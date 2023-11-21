package com.infinite.Project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infinite.Project.pojo.LoginEmp;


@RestController
@CrossOrigin(origins = "http://localhost:3000/") // Allowing requests from the React frontend
@RequestMapping("/api")
public class LoginController {
	

	@PostMapping(value="/login") public ResponseEntity<String> login(@RequestBody LoginEmp empl) { 
		System.out.print(empl.getEmpid());
		System.out.print(empl.getPassword()); 
		return ResponseEntity.ok("success"); 
	}
    
    
}
