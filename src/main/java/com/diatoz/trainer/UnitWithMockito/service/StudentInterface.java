package com.diatoz.trainer.UnitWithMockito.service;

import java.util.Set;

import com.diatoz.trainer.UnitWithMockito.domain.StudentDetails;
import com.diatoz.trainer.UnitWithMockito.domain.StudentDetailsDto;


public interface StudentInterface{
	
	public StudentDetails addnewStudent(StudentDetailsDto studentDetailsdto);
	public Set<StudentDetails>getStudentDetails();
	

}
