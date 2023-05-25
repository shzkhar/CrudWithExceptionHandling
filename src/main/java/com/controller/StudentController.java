package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.StudentDto;
import com.service.StudentService;
import com.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/addstudent")
	public ResponseEntity<StudentDto> addStudentt(@RequestBody StudentDto studentDto){
		StudentDto student =  studentService.saveStudent(studentDto);
		//return ResponseEntity.ok(studentDto);
		return new ResponseEntity<StudentDto>(student,HttpStatus.OK);
	}
}
