package com.diatoz.trainer.UnitWithMockito.servicestest;

import com.diatoz.trainer.UnitWithMockito.domain.Department;
import com.diatoz.trainer.UnitWithMockito.domain.DepartmentDto;
import com.diatoz.trainer.UnitWithMockito.domain.StudentDetails;
import com.diatoz.trainer.UnitWithMockito.domain.StudentDetailsDto;
public class GetDummyObjects {
	public static Department getDummyDepartment() {
		Department department = new Department();
		department.setDepartmentId(Integer.valueOf(1));
		department.setDepartmentName("Computer ");
		return department;
	}
	public static DepartmentDto getDummyDepartmentDto() {
		DepartmentDto department = new DepartmentDto();
		department.setDepartmentName("Computer ");
		return department;
	}
	public static StudentDetails getDummyStudent() {
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setStudentRollno(Integer.valueOf(1));
		studentDetails.setStudentName("Manikandan");
		return studentDetails;
	}
	public static StudentDetailsDto getDummyStudentDetailsDto() {
		StudentDetailsDto studentDetailsDto = new StudentDetailsDto();
		studentDetailsDto.setStudentName("Manikandan");
		return studentDetailsDto;
	}
}
