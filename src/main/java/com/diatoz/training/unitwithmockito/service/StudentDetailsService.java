package com.diatoz.training.unitwithmockito.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diatoz.training.unitwithmockito.domain.StudentDetails;
import com.diatoz.training.unitwithmockito.domain.StudentDetailsDto;
import com.diatoz.training.unitwithmockito.repostiory.StudentDetailRepo;

@Service
public class StudentDetailsService implements StudentInterface{
	
	@Autowired
	StudentDetailRepo studentDetailRepo;
	
	@Override
	public StudentDetails addnewStudent(StudentDetailsDto studentDetailsDto) {
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setStudentName(studentDetailsDto.getStudentName());
		return studentDetailRepo.save(studentDetails);
		
	}

	@Override
	public Set<StudentDetails> getStudentDetails() {
		
		return new HashSet<>(studentDetailRepo.findAll());
		
	}
}
