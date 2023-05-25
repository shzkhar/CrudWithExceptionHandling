package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advice.Alreadyexist;
import com.converter.StudentConverter;
import com.dto.StudentDto;
import com.entity.Student;
import com.repository.StudentRepo;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	StudentConverter studentConverter;
	
	@Override
	public StudentDto saveStudent(StudentDto studentDto) {
		Student studentExist = studentRepo.findByName(studentDto.getName());
		
		if(studentExist == null)
		{
			Student student = studentRepo.save(studentConverter.studentDtoToStudent(studentDto));
			return studentConverter.studentToStudenDto(student);
		}
		throw new Alreadyexist("Student Already Exist");
		
		
		
		
	}
	

	
}
