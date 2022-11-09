package com.HospitalMS.controller;

import java.util.List;

import javax.validation.Valid;

import com.HospitalMS.dto.staffDTO;
import com.HospitalMS.model.staff;
import com.HospitalMS.serviceImpl.staffServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class staffController {

	
	
	@Autowired
	private staffServiceImpl service;
	
	
	@GetMapping("/get")
	public ResponseEntity<List<staff>>getstaff(){
		List<staff>staffList= service.getstaff();
		return  new ResponseEntity<>(staffList,HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<staff> addUsers(@RequestBody @Valid staffDTO u1){
		
		return new ResponseEntity<>(service.addstaff(u1),HttpStatus.ACCEPTED);
		
	}

	@PutMapping("/update")
	public ResponseEntity<staff> updateUser(@RequestBody @Valid staffDTO u1){
		return new ResponseEntity<>(service.updatestaff(u1),HttpStatus.ACCEPTED);
	}
	
	
}
