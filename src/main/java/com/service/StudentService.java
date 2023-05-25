package com.service;

import com.dto.StudentDto;

public interface StudentService {

	StudentDto saveStudent(StudentDto studentDto);

	StudentDto findStudent(Integer sId);
}
