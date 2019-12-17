package com.diatoz.training.unitwithmockito.service;

import java.util.Set;

import com.diatoz.training.unitwithmockito.domain.StudentDetails;
import com.diatoz.training.unitwithmockito.domain.StudentDetailsDto;


public interface StudentInterface{
	
	public StudentDetails addnewStudent(StudentDetailsDto studentDetailsdto);
	public Set<StudentDetails>getStudentDetails();
	

}
