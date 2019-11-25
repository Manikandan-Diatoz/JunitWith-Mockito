package com.diatoz.trainer.UnitWithMockito.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diatoz.trainer.UnitWithMockito.domain.StudentDetails;
import com.diatoz.trainer.UnitWithMockito.domain.StudentDetailsDto;
import com.diatoz.trainer.UnitWithMockito.repostiory.StudentDetailRepo;

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
