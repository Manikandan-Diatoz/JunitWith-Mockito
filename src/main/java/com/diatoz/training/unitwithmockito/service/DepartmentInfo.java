package com.diatoz.training.unitwithmockito.service;
import java.util.Set;

import com.diatoz.training.unitwithmockito.domain.Department;
import com.diatoz.training.unitwithmockito.domain.DepartmentDto;
public interface DepartmentInfo
{
	Department addnewDepartment(DepartmentDto departmentdto);
	Set<Department> getAllDepartments();
}
