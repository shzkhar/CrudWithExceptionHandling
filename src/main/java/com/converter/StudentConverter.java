package com.converter;

import org.mapstruct.Mapper;

import com.dto.StudentDto;
import com.entity.Student;

@Mapper
public interface StudentConverter {
 
	StudentDto studentToStudenDto(Student student);
	
	Student studentDtoToStudent(StudentDto studentDto);
}
